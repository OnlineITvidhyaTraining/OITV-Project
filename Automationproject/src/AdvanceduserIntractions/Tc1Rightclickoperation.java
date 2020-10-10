package AdvanceduserIntractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Rightclickoperation {
	
	
	
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	
	@Test
      public void data(){
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		
	Actions action=new Actions(driver);
	
		action.contextClick(Gmail).build().perform();
		
	}
}
