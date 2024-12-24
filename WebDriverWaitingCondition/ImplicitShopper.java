package WebDriverWaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitShopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	
	}

}
