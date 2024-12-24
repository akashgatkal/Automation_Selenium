package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp_url="https://demo.guru99.com/test/simple_context_menu.html";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
		{
			Actions act=new Actions(driver);
			WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
//			act.moveToElement(double_click).doubleClick().perform();
			//another way
			act.doubleClick(double_click).perform();
			
			System.out.println("Action perform succesfully!");
			try {
				double_click.click();
				System.out.println("Pop is display on Guru 99 demo page");
				
			}catch(Exception e)
			{
				System.out.println("Pop is display on Guru 99 demo page");
			}
		}else
		{
			System.out.println("I am Not into Guru 99 demo page");
		}
		
			
	}

}
