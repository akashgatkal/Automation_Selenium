package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));
		act.moveToElement(beauty).perform();
		WebElement face = driver.findElement(By.xpath("//a[text()='Face Wash']"));
		act.click(face).build().perform();
		
		driver.close();
	}

}
