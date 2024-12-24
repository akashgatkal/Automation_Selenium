package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class AssRegister extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		verify();

		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).perform();

		WebElement gender = driver.findElement(By.id("gender-male"));
		act.sendKeys(gender).click().perform();

		WebElement firstName = driver.findElement(By.id("FirstName"));
		act.sendKeys(firstName, "Akash").perform();
		Thread.sleep(1000);
		WebElement last_Name = driver.findElement(By.id("LastName"));
		act.sendKeys(last_Name, "Gatkal").perform();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("Email"));
		act.sendKeys(email, "akashgatkal12@gmail.com").perform();
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("Password"));
		act.sendKeys(pass, "Pass@2001").perform();
		Thread.sleep(1000);
		WebElement confirmPass = driver.findElement(By.id("ConfirmPassword"));
		act.sendKeys(confirmPass, "Pass@2001").perform();
		Thread.sleep(1000);
		WebElement register = driver.findElement(By.id("register-button"));

		act.keyDown(Keys.ENTER).click(register).perform();
		Thread.sleep(1000);
		System.out.println("Execute");
		driver.quit();
	}

}
