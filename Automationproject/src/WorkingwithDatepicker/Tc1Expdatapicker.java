package WorkingwithDatepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Expdatapicker {

	
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
	}
	@Test
	public void data(){
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).sendKeys("09/24/2020");
	}
	
	
}
