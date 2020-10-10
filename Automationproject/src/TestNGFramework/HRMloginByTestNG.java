package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
public class HRMloginByTestNG {

	FirefoxDriver driver;
	ATUTestRecorder record;
	
	@BeforeTest
	
	public void open() throws ATUTestRecorderException {
		record= new ATUTestRecorder("C:\\Users\\Lenovo\\Desktop\\Recorder","login",false);
		record.start();
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void login() throws ATUTestRecorderException {
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		record.stop();
	}
	/*@Test(priority=1)
	public void checkstatus(){
		String Expected="Welcome Admin";
		String Actual=driver.findElement(By.linkText("Welcome Linda")).getText();
			
	Assert.assertEquals(Expected, Actual);	
	}
	@Test(priority=2)
	public void logout(){
		driver.findElement(By.linkText("Welcome Linda")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	public void close(){
		driver.close();*/
	//}
	
	
	
}
