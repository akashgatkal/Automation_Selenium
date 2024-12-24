package WebDriverWaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	}

}
