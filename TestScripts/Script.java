package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Script  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/* 
 * enter into dws page 
 * verify
 * click digital download link 
 * click all the products
 * after clicking ,mclick shopping cart
 * remove the highest price product by using dynamic way 
 * close the browser
 * */
		
		
		
		preCondition();
		login();
		
		if(verify()) 
		{
			driver.findElement(By.linkText("Digital downloads")).click();;Thread.sleep(1000);
			List<WebElement> add=driver.findElements(By.xpath("//input[@value='Add to cart']"));
			
			for(WebElement web:add) 
			{
				web.click();
				Thread.sleep(1000);
				
				
			}
			
			driver.findElement(By.className("close")).click();
			driver.findElement(By.className("ico-cart")).click();
			
			Thread.sleep(1000);
			
			
			
            List<WebElement> prices = driver.findElements(By.className("product-subtotal"));
            List<WebElement> removeButtons = driver.findElements(By.name("removefromcart"));

            double maxPrice = 0;
            int maxIndex = -1;
            Thread.sleep(1000);
            for (int i = 0; i < prices.size(); i++) {
                double price = Double.parseDouble(prices.get(i).getText());
                if (price > maxPrice) {
                    maxPrice = price;
                    maxIndex = i;
                }
            }
            Thread.sleep(1000);
            if (maxIndex != -1) {
                removeButtons.get(maxIndex).click();
                System.out.print("Product is remove Succesfully");
            }
			
		}else
		{
			System.out.print("Not Entered in DWS page");
		}
		Thread.sleep(1000);
		
		logout();
		postCondition();
		
		
		
	}

}
