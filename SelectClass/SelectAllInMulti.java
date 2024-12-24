package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllInMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///home/akash/Downloads/Telegram%20Desktop/demo.html");
		Thread.sleep(1000);
		
		WebElement multiall = driver.findElement(By.id("multiple_cars"));
		Select sel=new Select(multiall);
		
		List<WebElement> options = sel.getOptions();
		int i=0;
		for(WebElement web:options )
		{
//			web.click();
			// another option
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
	}

}
