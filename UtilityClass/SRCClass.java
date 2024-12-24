package UtilityClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import UtilityClass.BaseClass;
public class SRCClass extends BaseClass
{


	
	public static void main(String[] args) throws InterruptedException 
		{
			// TODO Auto-generated method stub
			String exp_Rss_url="https://demowebshop.tricentis.com/news/rss/1";
			preCondition();
			login();
			List<WebElement> social_links= driver.findElements(By.xpath("//div[@class='column follows us']//ul/li/a"));
			for(WebElement web : social_links) 
			{
				
				String act_url=driver.getCurrentUrl();
				if(exp_Rss_url.equals(act_url)) 
				{
					driver.navigate().back();
				}
				web.click();
				Thread.sleep(1000);
				
				
			
			}
			System.out.print("Succesfully fetch all links");
			logout();
			postCondition();
		}

	}



