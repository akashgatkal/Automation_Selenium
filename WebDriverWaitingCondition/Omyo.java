package WebDriverWaitingCondition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omyo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Assignment -
//		write a script for omayo.blogspot.com
//		1.open the browser 
//		2.maximize the browser 
//		3.open  the omayo
//		4.verify the page by url 
//		5.after verify scroll down 
//		6.click dropdown button which is present  at botton a
//		7.after clicking click on facebook and open the facebbok in different tab 
//		8.click create new account in fb page 
//		9.refresh the omayo page 
//		10.click timer enable button 
//		11.get the text of the popup and handle the popup 
//		12.close the browser 

		String expect = "https://omayo.blogspot.com/";
		String expectfb = "https://www.facebook.com/";
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://omayo.blogspot.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		String actual = driver.getCurrentUrl();

		if (expect.equals(actual)) {
			Actions act = new Actions(driver);

			WebElement click = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));

			act.scrollToElement(click).perform();

			driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

			String parent = driver.getWindowHandle();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']")));

			act.keyDown(Keys.CONTROL).click(fb).perform();

			Set<String> child = driver.getWindowHandles();

			for (String window : child) {
				driver.switchTo().window(window);
				String actualfb = driver.getCurrentUrl();

				if (expectfb.equals(actualfb)) {
					System.out.println("i am in fb page ");
					driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

				}

			}
			driver.switchTo().window(parent);

			driver.navigate().refresh();

			wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));

			driver.findElement(By.id("timerButton")).click();

			Alert alt = driver.switchTo().alert();

			System.out.println(alt.getText());

			alt.accept();
			act.keyDown(Keys.ENTER);

			driver.quit();

		} else {
			System.out.println("page is not found ");
		}
	}
}
