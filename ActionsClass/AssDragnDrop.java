package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssDragnDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		Actions act =new Actions(driver);
//		List<WebElement> capitals = driver.findElements(By.xpath("//div[@class='dragableBox']"));

		List<WebElement> countries = driver.findElements(By.cssSelector("#countries > div"));
        

//		List<WebElement> cities = driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		for(WebElement web:countries)
		{
			String countryId=web.getAttribute("id");
			
			String targetZoneId = getTargetZoneId(countryId);
			 WebElement drop = driver.findElement(By.id(targetZoneId));

			act.dragAndDrop(web, drop).perform();
			Thread.sleep(1000);
			
			System.out.println("Perform all Actions");
			
		}
	}
		private static String getTargetZoneId(String countryId) 
		{
		        switch (countryId) 
		        {
		            case "box1": return "box101"; // Norway
		            case "box2": return "box102"; // Sweden
		            case "box3": return "box103"; //  united states
		            case "box4": return "box104"; // denmark
		            case "box5": return "box105"; //  South Korea
		            case "box6": return "box106"; // Italy
		            case "box7": return "box107"; // spain
		            default: throw new IllegalArgumentException("Unknown country ID: " + countryId);
		        
		}
//				return countryId;
		
	}

}
