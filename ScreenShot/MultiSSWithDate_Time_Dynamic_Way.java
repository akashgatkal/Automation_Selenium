package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultiSSWithDate_Time_Dynamic_Way {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/books");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("/home/akash/Pictures/ScreenShot/DWS"+time+".png");
		FileHandler.copy(from, to);
		
		
	}

}
