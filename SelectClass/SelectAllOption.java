package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("file:///home/akash/Downloads/Telegram%20Desktop/demo.html");
		Thread.sleep(1000);
		WebElement single = driver.findElement(By.id("standard_cars"));
		
		Thread.sleep(1000);
		Select sel=new Select(single);
		List<WebElement> options = sel.getOptions();
		int i=0;
		for(WebElement web:options )
		{
//			web.click();
			// another option
			sel.selectByIndex(i++);
			
			Thread.sleep(1000);
		}
		System.out.println("All Options selected");
		driver.quit();
		
	}

}
