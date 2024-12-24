package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssNaukari {
	public static void main(String[] args) throws InterruptedException {

        // Initialize the ChromeDriver
        ChromeDriver obj = new ChromeDriver();
        obj.manage().window().maximize();
        obj.get("https://www.naukri.com/registration/createAccount?");
        Thread.sleep(2000);

        // Fill in the form details
        obj.findElement(By.xpath("//input[@id='name']")).sendKeys("Akash Gatkal");
        Thread.sleep(1000);
        obj.findElement(By.xpath("//input[@id='email']")).sendKeys("akashgatkal123@gmail.com");
        Thread.sleep(1000);
        obj.findElement(By.xpath("//input[@id='password']")).sendKeys("Akash@2001");
        Thread.sleep(1000);
        obj.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9657004387");
        Thread.sleep(1000);
        obj.findElement(By.xpath("//div[@class='textWrap']")).click();
        Thread.sleep(1000);   
        obj.findElement(By.xpath("//input[@type='file']")).sendKeys("/home/akash/Downloads/Akash Resume (1).pdf");     
        System.out.println("Resume uploaded successfully!");
        Thread.sleep(3000);
       
    }
}
