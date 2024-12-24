package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class OpenDiffTabAll extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		Actions act =new Actions(driver);
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		
		for(WebElement web:all)
		{
			act.keyDown(Keys.CONTROL).click(web).perform();
			Thread.sleep(1000);
			
		}
		postCondition();
		
		
	}

}
