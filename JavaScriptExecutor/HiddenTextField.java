package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement custom_gender = driver.findElement(By.id("custom_gender"));
//		custom_gender.sendKeys("Manjulika");
		Thread.sleep(2000);
		js.executeAsyncScript("arguments[0].value='manjulika'", custom_gender);
	}

}
