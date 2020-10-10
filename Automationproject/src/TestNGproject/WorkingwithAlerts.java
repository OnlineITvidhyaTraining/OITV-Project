package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithAlerts {

	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.tssouthernpower.com/");
	}
	@Test
	public void data() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='solutions-left-column']/a/img")).click();
		
		Thread.sleep(3000);

		String value=driver.switchTo().alert().getText();
		System.out.println(value);
		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
	}
}
