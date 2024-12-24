package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropByEach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));

		act.dragAndDrop(rome, italy).perform();
		Thread.sleep(2000);

		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(madrid,spain).perform();
		Thread.sleep(2000);

		WebElement seol = driver.findElement(By.id("box5"));
		WebElement south_korea = driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(seol,south_korea).perform();
		Thread.sleep(2000);

		WebElement washington = driver.findElement(By.id("box3"));
		WebElement unitedStates = driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(washington,unitedStates).perform();
		Thread.sleep(2000);

		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement swedan = driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(stockholm,swedan).perform();
		Thread.sleep(2000);

		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(oslo,norway).perform();
		Thread.sleep(2000);

		WebElement copenhagen = driver.findElement(By.id("box4"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(copenhagen,denmark).perform();
		Thread.sleep(2000);

		System.out.println("perform all actions");
		driver.quit();

	}

}
