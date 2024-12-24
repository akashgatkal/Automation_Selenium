package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exp_title=("Demo Web Shop");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			System.out.println("i am in dws page");
			
			driver.findElement(By.className("ico-register")).click();
			String exp_reg_title=("Demo Web Shop. Register");
			
			driver.get("https://demowebshop.tricentis.com/register");
			String act_reg_title=driver.getTitle();
			
			if(exp_reg_title.equals(act_reg_title))
			{
				System.out.println("i am in register page");
				
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys("Akash");
				driver.findElement(By.id("LastName")).sendKeys("Gatkal");
				driver.findElement(By.id("Email")).sendKeys("akashgatkal8890009@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("Gatkal@123");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("Gatkal@123");
				driver.findElement(By.id("register-button")).click();
				
				driver.findElement(By.className("register-continue-button")).click();

				
				
	
			}else 
			{
				System.out.println("i am in register page");
				
			}
			
			
			
		}
		else 
		{
			System.out.println("i am not in dws page");
		}
		Thread.sleep(2000);
	//	driver.close();
		
	}

}
