package WorkingwithFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Countframes {
FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	
	@Test
	public void data(){
		List<WebElement>Nframes=driver.findElements(By.tagName("frame"));
		System.out.println("no of Frames are"+"  "+Nframes.size());
	}
	
	@AfterTest
	public void close(){
	driver.close();
	}
}
