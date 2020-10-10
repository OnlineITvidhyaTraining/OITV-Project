package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class OrangeHRMbyTestNG {
	FirefoxDriver driver;
	ATUTestRecorder record;
	@BeforeTest
	public void open() throws ATUTestRecorderException{
		record=new ATUTestRecorder("C:\\Users\\Lenovo\\Desktop\\Recordings","HRMlogin",false);
		record.start();
		 driver=new FirefoxDriver();
		 driver.get("https://opens///////ource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test(priority=0)
	public void login() throws InterruptedException{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void verifyloginstatus(){
		String Expected="Welcome Admin";
		String Actual=driver.findElement(By.linkText("Welcome Admin")).getText();
		Assert.assertEquals(Expected, Actual);	
	}
	@Test(priority=2)
	public void logout(){
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
			
	}
	
	@AfterTest
	public void close() throws ATUTestRecorderException{
		driver.close();
		record.stop();
	}
	
	
	
	

}
