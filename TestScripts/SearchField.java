package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class SearchField extends BaseClass{

//	public static void main(String[] args ) throws InterruptedException {
		// TODO Auto-generated method stub
/*		1)search field */
		
//		preCondition();
//		login();
//		driver.findElement(By.id("small-searchterms")).sendKeys("Akash");
//		logout();
//		postCondition();
 /* 
 * 
//2)
//1)open browser
//maximize 
//enter into url verify using url 
//do login function 
//click add to cart of 25$  gift card
 * click gift card
 * change quantity to 2
 * add product to shopping cart -after adding -verify product -prduct is added in shopping cart or not - after verificaremovw product from shopping cart-update shooping cart
 * 
 */
	public static void main(String[] args) throws InterruptedException 
	 {
	  BaseClass.preCondition();
	  if(BaseClass.verify())
	  {
	   System.out.println("in dws page");
	   BaseClass.login();
	   System.out.println("logged in");
	   BaseClass.driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("admin01");
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("admin01@gmail.com");
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.id("giftcard_2_Message")).sendKeys("Want to buy this as a gift");
	   Thread.sleep(1000);
	   WebElement quantity=BaseClass.driver.findElement(By.id("addtocart_2_EnteredQuantity"));
	   quantity.clear();
	   quantity.sendKeys(String.valueOf(2));
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.id("add-to-cart-button-2")).click();
	   System.out.println("added to cart");
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.className("close")).click();
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
	   Thread.sleep(1000);
	   WebElement checkButton=BaseClass.driver.findElement(By.id("checkout"));
	   if(checkButton.isDisplayed())
	   {
	    System.out.println("Product added to cart");
	   }
	   else
	   {
	    System.out.println("Product not added to cart");
	   }
	   BaseClass.driver.findElement(By.cssSelector("input[name='removefromcart']")).click();
	   Thread.sleep(1000);
	   BaseClass.driver.findElement(By.cssSelector("input[name='updatecart']")).click();
	   Thread.sleep(1000);
	   BaseClass.logout();
	   BaseClass.postCondition();
	  }
	  else
	  {
	   System.out.println(" I Am  Not in dws page");
	  }
	 }

	}


