package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("file:///home/akash/Downloads/Telegram%20Desktop/demo.html");
		WebElement single=driver.findElement(By.id("standard_cars"));
		Select sel =new Select(single);
		Thread.sleep(1000);
		
		sel.selectByVisibleText("BMW");
		Thread.sleep(1000);
		sel.selectByValue("for");
		Thread.sleep(1000);
//		sel.deselectByIndex(7);
		sel.selectByIndex(0);
		
//		sel.deselectByIndex(0);   // java.lang.UnsupportedOperationException
		
		
	}

}
