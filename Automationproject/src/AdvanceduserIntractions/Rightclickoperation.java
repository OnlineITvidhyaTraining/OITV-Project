package AdvanceduserIntractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickoperation {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void data(){
	WebElement button=driver.findElement(By.name("btnK"));
	Actions action=new Actions(driver);
	
	action.doubleClick(button).build().perform();
	
	
	
	
	
		
		
		
		
	}
	
	
}
