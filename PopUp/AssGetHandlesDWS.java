package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class AssGetHandlesDWS extends BaseClass {

//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		preCondition("chrome");
//		if (verify()) {
//			String exp_rss = "https://demowebshop.tricentis.com/news/rss/1";
//			String parent = driver.getWindowHandle();
//			Actions act = new Actions(driver);
//			act.keyDown(Keys.PAGE_DOWN).perform();
//			List<WebElement> social_links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
//
//			for (WebElement web : social_links) {
////					String act=driver.getCurrentUrl();
//				web.click();
//				if (driver.getCurrentUrl().equals(exp_rss)) {
//					driver.navigate().back();
//				}
//				
//				Thread.sleep(1000);
//			}
//			Set<String> childs = driver.getWindowHandles();
//			driver.switchTo().window(parent);
//			Thread.sleep(1000);
//			String FB_exp = "https://www.facebook.com/nopCommerce";
//			for (String str : childs) {
//				driver.switchTo().window(str);
//				if (driver.getCurrentUrl().equals(FB_exp)) {
//					driver.findElement(By.xpath("//span[text()='Create new account']")).click();
//					Thread.sleep(1000);
//					System.out.println("Done!");
//				}
//			}
//			Thread.sleep(1000);
//			driver.switchTo().window(parent);
//			Thread.sleep(2000);
//			String twitter_url = "https://x.com/nopCommerce";
//			for (String str : childs) {
//				driver.switchTo().window(str);
//				if (driver.getCurrentUrl().equals(twitter_url)) {
//					WebElement create_acc = driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
//					act.keyDown(Keys.PAGE_DOWN).click(create_acc).perform();
////					 act.click(create_acc);
//					Thread.sleep(1000);
//					System.out.println("Done!");
//				}
//			}
//			Thread.sleep(1000);
//			driver.switchTo().window(parent);
//			Thread.sleep(2000);
//			String yt = "https://www.youtube.com/user/nopCommerce";
//			for (String str : childs) {
//				driver.switchTo().window(str);
//				if (driver.getCurrentUrl().equals(yt)) {
//					WebElement search_field = driver.findElement(By.xpath("//div/input[@id='search']"));
//					act.click(search_field).sendKeys(search_field, "What is Selenium?");
//					Thread.sleep(1000);
//					System.out.println("Done!");
//				}
//			}
//			Thread.sleep(1000);
//			driver.switchTo().window(parent);
//			Thread.sleep(2000);
//			String google_sub = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
//			for (String str : childs) {
//				driver.switchTo().window(str);
//				if (driver.getCurrentUrl().equals(google_sub)) {
//					WebElement search = driver.findElement(By.xpath("//div/input[@class='required email']"));
//					act.click(search).sendKeys(search, "ak123@gmail.com");
//					Thread.sleep(1000);
//					System.out.println("Done!");
//				}
//			}
//			Thread.sleep(1000);
//			driver.switchTo().window(parent);
//			driver.findElement(By.className("ico-register")).click();
//			Thread.sleep(2000);
//			driver.switchTo().window(parent);
//			driver.findElement(By.id("small-searchterms")).sendKeys("vicco");
//			Thread.sleep(2000);
//		} else {
//			System.out.println("I am not in DWS page");
//		}
////		driver.quit();
//	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
//		Assignment 
//		wrte a script for dws website 
//		1.open the browser 
//		2.maximize the page 
//		3.enter into dws page after that verify the page by using url
//		4.after that scroll down '
//		5.after scrolling click 5 element socials fb twitter rss google click 
//		after licking all the emlement click create new account button in fb 
//		6.next click create acc in twitter 
//		7.send some values inside search fields the  youtube  later then send some value inside google subscribtion search field 
//		8.afterowds click register button 
//		9.close the all window 
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://demowebshop.tricentis.com/");
		 
		String parent = driver.getWindowHandle();
		 
		 Actions act =new Actions(driver);
		 
		 act.keyDown(Keys.PAGE_DOWN).perform();
		 
		List<WebElement> social = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		
		
		String rss ="https://demowebshop.tricentis.com/news/rss/1";
		
		for(WebElement web :social)
		{
			String rss2=driver.getCurrentUrl();
			
			 if(rss.equals(rss2))
			 {
				// web.click();
				 driver.navigate().back();
				 //Thread.sleep(2000);
			 }
			
			web.click();
		}
		
		 Set<String> child = driver.getWindowHandles();
		
		 String fb= "https://www.facebook.com/nopCommerce";
		 String tw="https://x.com/nopCommerce";
		 String utube="https://www.youtube.com/user/nopCommerce";
		 String google="https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		 
		for(String web2:child)
		{
			
			
			driver.switchTo().window(web2);
			
			String current =driver.getCurrentUrl();
			
			 if(current.equals(fb))
			 {
				 driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				 Thread.sleep(2000);
				 System.out.println("facebookentered");
			 }
			 else if(current.equals(tw))
			 {
				 driver.findElement(By.xpath("//span[text()='Create account']")).click();
				 Thread.sleep(2000);
				 System.out.println("Sign in in Twitter page");
			 }
			 else if(current.equals(utube))
			 {
				 driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("pahun jevla ka");
				 Thread.sleep(2000);
				 System.out.println("yt Entered");
				 
			 }
			 else if (current.equals(google))
			 {
				 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akashgatkal@gmail.com");
				 Thread.sleep(2000);
				 System.out.println("Google Entered");
			 }
			
		}
		
		driver.switchTo().window(parent);
		
         WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));

		act.doubleClick(register).perform();
		
  
	}

}
