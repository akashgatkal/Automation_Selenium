package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fetch_All_Product_Price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		   WebDriver obj = new ChromeDriver();
		      obj.manage().window().maximize();
		      obj.get("https://demowebshop.tricentis.com/");
		      Thread.sleep(2000);
		      
		      
		      //click on the Digital Download 
		      obj.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		      Thread.sleep(2000);
		      
		      String album_3rd=obj.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
		      System.out.println("Album 3rd price : "+ album_3rd);
		      
		      //Xpath text function
		      String Music_2=obj.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span")).getText();
		      System.out.println("Music 2 price : "+ Music_2);
		      
		      //Xpath Group of index
		      String Music_2_sameN=obj.findElement(By.xpath("(//a[text()='Music 2'])[2]/../following-sibling::div[3]/div/span")).getText();
		      System.out.println("Music 2 price same name : "+ Music_2_sameN);
		      
		      obj.close();

	}

}
  
