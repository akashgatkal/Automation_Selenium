package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class KeyBoardAction extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");

		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys("playStations ps5").perform();

		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		postCondition();
	}

}
