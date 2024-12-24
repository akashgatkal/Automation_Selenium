package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleEleMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act=new Actions(driver);
		List<WebElement> all = driver.findElements(By.className("desktop-main"));
		
		for(WebElement web:all)
		{
			act.moveToElement(web).perform();
			Thread.sleep(1000);
		}
		driver.close();
		
		
	}

}
