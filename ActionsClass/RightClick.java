package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement right_click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement click = driver.findElement(By.xpath("//span[text()='Copy']"));
//		act.moveToElement(right_click).contextClick().click(click).perform();
		//another way
		act.contextClick(right_click).click(click).perform();
		//pop verify
		try {
			right_click.click();
			System.out.println("Pop is Not Displayed");
		}catch(Exception e)
		{
			System.out.println("Pop is Displayed");
		}
		driver.close();
//	unhandledAlertException-	Before handling alert pop-up
//		for Handle we need to verify pop is display or not
	}

}
