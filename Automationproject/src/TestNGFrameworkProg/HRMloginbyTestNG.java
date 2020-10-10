package TestNGFrameworkProg;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGFrameworkProg.TestNGListeners.class)
public class HRMloginbyTestNG {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	}
	
	
	@Test(priority=1)
	public void checkstatus(){
		String Expected="Welcome Linda";
		String Actual=driver.findElement(By.linkText("Welcome Linda")).getText();
		
		Assert.assertEquals(Expected, Actual);
	}

	@Test(priority=2)
	public void logout(){
		driver.findElement(By.linkText("Welcome Carlos")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
}
