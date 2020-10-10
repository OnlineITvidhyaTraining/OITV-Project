package WorkingwithFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickonElementWithoutFrameno {
FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	
	@Test
	public void data(){
		List<WebElement>frames=driver.findElements(By.tagName("frame"));
	
		for(int i=0;i<frames.size();i++){
			try{
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
		}
		catch(Exception x){
			driver.switchTo().defaultContent();
		}
			
		}
	}
	
	
	
}
