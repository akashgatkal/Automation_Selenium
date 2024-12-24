package WebDriverWaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDWS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("file:///home/akash/Downloads/Telegram%20Desktop/iframe%20(1).html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//li[@class='facebook']/a")).click();
		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
