package WorkingwithWebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Countwebtables {

      FirefoxDriver driver;
	@BeforeTest
	public void open(){
		
	driver=new FirefoxDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
			
	}
	
	@Test
	public void count(){
		List<WebElement>Tables=driver.findElements(By.tagName("table"));
		System.out.println("No of Webtables are"+"   "+Tables.size());
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
}
