package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class ChildBrowser extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		String parent = driver.getWindowHandle();
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(1000);
		Set<String> childs = driver.getWindowHandles();
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		String FB_exp = "https://www.facebook.com/nopCommerce";
		for (String str : childs) {
			driver.switchTo().window(str);
			if (driver.getCurrentUrl().equals(FB_exp)) {
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Thread.sleep(1000);
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("vicco");
		Thread.sleep(2000);
		driver.quit();

	}

}
