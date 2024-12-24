package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		Actions act =new Actions(driver);
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
	 	
		driver.close();
		//Assignment-do all capitals to its respective cities
	}

}
