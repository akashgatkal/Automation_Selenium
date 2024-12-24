package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class OpenInDifferentTab extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		Actions act=new Actions(driver);
		WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		act.keyDown(Keys.CONTROL).click(books).perform();
		
//		act.keyDown(Keys.SHIFT).click(books).perform();
		postCondition();
	}

}
