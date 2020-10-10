package WorkingwithWebtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountnoofRowsCOlumns {
	 FirefoxDriver driver;
		@BeforeTest
		public void open(){	
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");		
		}
		
		@Test
	public void countingrowscolumns(){
		List<WebElement>novalues=driver.findElements(By.tagName("tr"));
		System.out.println("no of rows are"+"  "+novalues.size());
		
		novalues=driver.findElements(By.tagName("td"));
		System.out.println("no of columns are"+"  "+novalues.size());
	}
		
		
		
		
		
		
		
		
		
		
}
