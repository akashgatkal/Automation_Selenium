package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssAlert {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
//		write  script for 
//		demo.automationtesting.in page 
//		1.open the browser 
//		2.maximize the browser 
//		3.enter into demo.automationtesting page 
//		4.click the alert with ok 
//		5.click button to display and alert box and retirve the text of alert  box
//		and click ok button on alert box 

        ChromeDriver driver =new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Alerts.html");
        
        
        ///Alert with OK 
        
       WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
       
       simple.click();
       
       Alert alt = driver.switchTo().alert();
         
        String msg = alt.getText();
        
        System.out.println(msg);
        
        alt.accept();
       
        
        ///Alert with OK & Cancel 
        
        driver .findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
        
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        
        Alert alt2=driver.switchTo().alert();
        
        String msg2 = alt2.getText();
        System.out.println(msg2);
        
        //alt2.dismiss();
        alt2.accept();
        
        
        ///Alert with Textbox 
        
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
        
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        
        Alert alt3 =driver.switchTo().alert();
        
        alt3.sendKeys("Akash");
        Thread.sleep(2000);
         String msg3 = alt3.getText();
         
         System.out.println(msg3);
         alt3.accept();
        
         
//         driver.close();
      }

}
