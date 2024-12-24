package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		WebElement fileupload = driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.sendKeys("/home/akash/Downloads/Telegram Desktop/wikkly report.docx");
		Thread.sleep(2000);
	}

}
