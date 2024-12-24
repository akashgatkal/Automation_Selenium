package WebDriverWaitingCondition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit way
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		//Explicit way
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.switchTo().frame(0); //By int index value
//		driver.switchTo().frame("send-sms-iframe"); // by string type id value
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Mobile Number']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9657004387");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
		
		
	}

}
