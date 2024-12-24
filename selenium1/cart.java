package selenium1;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class cart extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition();
		
		driver.findElement(By.className("ico-cart")).click();
	}

}
