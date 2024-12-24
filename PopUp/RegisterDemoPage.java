package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gatkal");
		driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys("Gatkal Wasti");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ak@gmail.com");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		Select sel = new Select(lang);
		lang.click();
		sel.selectByVisibleText("Hindi");
		sel.selectByVisibleText("English");

		WebElement skills = driver.findElement(By.id("Skills"));
		Select sel1 = new Select(skills);
		sel1.selectByIndex(26);
		sel1.selectByIndex(27);
		WebElement country = driver.findElement(By.id("countries"));
		Select sel2 = new Select(country);
		sel2.selectByIndex(0);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("india");
		driver.findElement(By.xpath("//li[text()='India']")).click();

		WebElement year = driver.findElement(By.id("yearbox"));
		Select sel3 = new Select(year);
		sel3.selectByVisibleText("2013");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel4 = new Select(month);
		sel4.selectByIndex(5);
		WebElement day = driver.findElement(By.id("daybox"));
		Select sel5 = new Select(day);
		sel5.selectByIndex(20);
		driver.findElement(By.id("firstpassword")).sendKeys("Pass@123");
		driver.findElement(By.id("secondpassword")).sendKeys("Pass@123");
		driver.findElement(By.id("submitbtn")).click();

	}

}
