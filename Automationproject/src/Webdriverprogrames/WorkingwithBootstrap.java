package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithBootstrap {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com");
	}
	@Test
	public void data(){
		driver.findElement(By.linkText("Sign In")).click();
		driver.switchTo().frame(0);
		
	driver.findElement(By.id("authMobile"))	.sendKeys("8978002727");
	driver.findElement(By.id("mobileSubmitBtn")).click();
		
		
		
		
		
		
		
		
	}
}
