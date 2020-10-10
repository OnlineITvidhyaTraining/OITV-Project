package TestNGFrameworkProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
	driver.findElement(By.id("searchBtn")).click();
	
	String value=driver.switchTo().alert().getText();
	System.out.println(value);
	
	//to insert data
	driver.switchTo().alert().sendKeys("Admin");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	driver.switchTo().alert().dismiss();
	
	
	
	}
}
