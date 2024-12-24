package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_Coordinates {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/personal-care");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
	}

}
