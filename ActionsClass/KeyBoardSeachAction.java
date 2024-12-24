package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class KeyBoardSeachAction extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		
		Actions act=new Actions(driver);
		WebElement subscribe = driver.findElement(By.id("newsletter-email"));
		act.sendKeys(subscribe, "Dhruv rathi").perform();
	}

}
