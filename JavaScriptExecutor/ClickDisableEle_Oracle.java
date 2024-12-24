package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDisableEle_Oracle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.13_linux-x64_bin.rpm"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", jdk);
		
		jdk.click();
		WebElement disable_ele = driver.findElement(By.linkText("Download jdk-17.0.13_linux-x64_bin.rpm"));
		js.executeScript("arguments[0].click();", disable_ele);
		

	}

}
