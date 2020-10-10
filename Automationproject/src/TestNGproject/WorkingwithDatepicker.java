package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithDatepicker {

	FirefoxDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException{
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='7/12/2020'");
	Thread.sleep(3000);
	js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='7/15/2020'");
	
	
		
	}
}
