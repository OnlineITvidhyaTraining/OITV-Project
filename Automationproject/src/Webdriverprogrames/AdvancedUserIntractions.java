package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdvancedUserIntractions {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void operation() throws InterruptedException{
		
	
	Actions action=new Actions(driver);
	
	WebElement button=driver.findElement(By.name("btnK"));
	
	action.doubleClick(button).build().perform();
		
		
	}
	
	
	
}
