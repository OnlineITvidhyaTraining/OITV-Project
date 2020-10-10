package TestNGproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Webdriverprogrames.TestNGListeners.class)
public class HrmloginByTestNG {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		 driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test(priority=0)
	public void login() throws InterruptedException, IOException{
FileInputStream  fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\lockdown\\Automationproject\\HRMLogin.properties");	
Properties pr=new Properties();
pr.load(fso);

		driver.findElement(By.id(pr.getProperty("user"))).clear();
		driver.findElement(By.id(pr.getProperty("user"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("pass"))).clear();
		driver.findElement(By.id(pr.getProperty("pass"))).sendKeys("admin123");
		driver.findElement(By.id(pr.getProperty("log"))).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	public void checkloginstatus(){
		String Expected="Welcome QA";
		String Actual=driver.findElement(By.linkText("Welcome Admin")).getText();
		
		Assert.assertEquals(Expected, Actual);
	}
	@Test(priority=2)
	public void logout(){
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
