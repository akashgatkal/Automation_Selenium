package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssEaseMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='input_cld']")).click();
		driver.findElement(By.xpath("	//li[@class='active-date']")).click();
		// li[@class='active-date']
		driver.findElement(By.xpath("//input[@class='input_cld hide-ddate round-but1']")).click();
		// input[@class='input_cld hide-ddate round-but1']
		driver.findElement(By.xpath("//div[@class='month3']")).click();
		driver.findElement(By.xpath("//div[@class='month3']")).click();
		driver.findElement(By.xpath("//div[@class='month3']")).click();
		driver.findElement(By.xpath("//li[@id='trd_2_11/03/2025']")).click();
		
	}

}

//WebDriver obj= new ChromeDriver();
//obj.manage().window().maximize();
//obj.get("https://www.easemytrip.com/");
//Thread.sleep(2000);
//
//obj.findElement(By.xpath("//div[@id='dvfarecal']")).click();
//Thread.sleep(1000);
//obj.findElement(By.xpath("//li[@id='snd_3_11/12/2024']")).click();
//Thread.sleep(1000);
//obj.findElement(By.xpath("//div[@id='divRtnCal']")).click();
//Thread.sleep(1000);
//for(;;) {
//	try {
//		obj.findElement(By.xpath("//li[@id='trd_2_11/03/2025']")).click();
//		break;
//	} catch (Exception e) {
//		
//		obj.findElement(By.xpath("//img[@id='img2Nex']")).click();
//	}
//	Thread.sleep(1000);
//}
