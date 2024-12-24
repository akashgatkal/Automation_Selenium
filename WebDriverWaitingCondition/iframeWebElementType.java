package WebDriverWaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeWebElementType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit way
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9657004387");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
		
	}

}
