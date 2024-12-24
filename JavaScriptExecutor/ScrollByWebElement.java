package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement cust_policies = driver.findElement(By.xpath("//p[text()=' CUSTOMER POLICIES ']"));
		js.executeScript("arguments[0].scrollIntoView(false);", cust_policies);
//		js.executeScript("arguments[0].scrollIntoView(true);", cust_policies);
		Thread.sleep(2000);
	}

}
