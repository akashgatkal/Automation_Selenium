package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusCalenderpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exp_url = "https://www.redbus.in/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String act_url = driver.getCurrentUrl();
		if (exp_url.equals(act_url)) {
			driver.findElement(By.xpath("//input[@class='sc-bxivhb dsDRlf']")).sendKeys("pune");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='sc-kAzzGY cCrHkP']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 gOPCJZ']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='search_button']")).click();
			Thread.sleep(1000);

		} else {
			System.out.print("I am not in Red Bus page");
		}
		/*
		 * verify by url fill frome and to search field select journey 23 and click
		 * search bus close
		 */
	}

}
