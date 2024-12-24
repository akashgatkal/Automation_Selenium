package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class Scrolling extends BaseClass {
//Scrolling the page for playing with mouse actions
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_UP).perform();
		Thread.sleep(1000);

		postCondition();

	}

}
