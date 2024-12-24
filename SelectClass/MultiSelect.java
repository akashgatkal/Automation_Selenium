package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MultiSelect  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("file:///home/akash/Downloads/Telegram%20Desktop/demo.html");
		
		WebElement multiDropdown=driver.findElement(By.id("multiple_cars"));
		Select sel=new Select(multiDropdown);
		//select by methods
		sel.selectByVisibleText("Land Rover");Thread.sleep(1000);
		sel.selectByValue("merc");Thread.sleep(1000);
		sel.selectByIndex(8);Thread.sleep(1000);
		sel.selectByVisibleText("Nissan");Thread.sleep(1000);
		//deselect methods
//		sel.deselectByVisibleText("Land Rover");Thread.sleep(1000);
//		sel.deselectByValue("merc");Thread.sleep(1000);
//		sel.deselectByIndex(8);Thread.sleep(1000);
//		sel.deselectByVisibleText("Nissan");Thread.sleep(1000);
//		
		//Deselect all
		sel.deselectAll();
		
		if(sel.isMultiple())
		{
			System.out.print("It is a Multi-select Dropdown Menu");
		}
		else
		{
			System.out.print("It is a Single-select Dropdown Menu");
		}
		driver.quit();
		
		
	}

}
