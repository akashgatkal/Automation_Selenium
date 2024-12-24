package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class GetHandleOfPage extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exp_rss="https://demowebshop.tricentis.com/news/rss/1";
		preCondition("chrome");
		String parent=driver.getWindowHandle();
		System.out.println("Parent :"+ parent);
		login();
		List<WebElement> social_links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		
		for (WebElement web : social_links) 
		{
//				String act=driver.getCurrentUrl();
				if(driver.getCurrentUrl().equals(exp_rss)) {
					driver.navigate().back();
				}
				web.click();
				Thread.sleep(1000);
		}
		Set<String> childs=driver.getWindowHandles();
		System.out.println("childs: " + childs);
		logout();
	}

}
