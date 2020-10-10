package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithAlerts {

	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
	}
	
	@Test
	public void data() throws InterruptedException{
		Thread.sleep(3000);

	driver.findElement(By.id("searchBtn")).click();
	
	Thread.sleep(3000);
	
	String value=driver.switchTo().alert().getText();
	System.out.println(value);
	
	driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
	}
}
