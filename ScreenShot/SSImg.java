package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSImg {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://x.com/actorvijayteam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@role='button']/div/span")).click();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("//div[@class='css-175oi2r r-sdzlij r-1udh08x r-5f1w11 r-u8s1d r-8jfcpp']"));

		File from = profile.getScreenshotAs(OutputType.FILE);
		File to=new File("/home/akash/Pictures/ScreenShot/vijayProfile1.png");
		FileHandler.copy(from, to);
		
	}

}
