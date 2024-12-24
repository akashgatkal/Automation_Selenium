package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotificationHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		// if we are not getting handle notification using action class we go for Robot
		// class
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(2000);
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(2000);
//		
//		act.keyDown(Keys.ENTER).perform();
		Robot bot = new Robot();
		bot.keyPress(KeyEvent.VK_TAB);Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);Thread.sleep(1000);
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_ENTER);
	}

}
