package WorkingwithDatepicker;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex2Datepicker {


	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void operation() throws InterruptedException{
		
		Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='14/09'");
Thread.sleep(3000);

js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='24/09'");


		
	}
	
	
	
	
	
}
