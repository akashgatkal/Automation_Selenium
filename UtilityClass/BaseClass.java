package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static void preCondition(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("InternetExplorer"))
		{
			driver=new InternetExplorerDriver();
			
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
			
		}
		else 
		{
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");	
	}
	public static void login() throws InterruptedException
	{
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='RememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
	public static boolean verify() throws InterruptedException
	 {
	  if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"))
	  {
	   return true;
	  }
	  return false;
	 }
	public static void logout()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
	}
	public static void postCondition()
	{
		driver.close();
	}

}
