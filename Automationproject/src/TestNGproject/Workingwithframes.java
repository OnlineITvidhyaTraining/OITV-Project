package TestNGproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithframes {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	
	@Test
	public void data() throws InterruptedException{
	
		List<WebElement>frames=driver.findElements(By.tagName("frame"));
		for(int i=0;i<frames.size();i++){
			driver.switchTo().frame(i);
	  try{
			
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
		
	  }
	  catch(Exception x){
		  driver.switchTo().defaultContent();
	  }
		
		
		
		
		
		
		
		}
		
		
	}
}
