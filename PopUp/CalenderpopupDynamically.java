package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderpopupDynamically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-12-10']")).click();
		Thread.sleep(1000);
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//span[@data-selenium-date='2025-03-10']")).click();
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
				
			}
			Thread.sleep(1000);
		}
	}
//ease my trip and naukari.com
}
