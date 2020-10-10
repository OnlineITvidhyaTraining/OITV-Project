package TestNGFrameworkProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginbyProperties {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void data() throws IOException, InterruptedException{
		FileInputStream fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\lockdown\\Automationproject\\OrangeLogin.properties");
		Properties pr=new Properties();
		pr.load(fso);
		
driver.findElement(By.id(pr.getProperty("user"))).sendKeys("Admin");
driver.findElement(By.id(pr.getProperty("pass"))).sendKeys("admin123");
driver.findElement(By.id(pr.getProperty("log"))).click();

Thread.sleep(3000);

driver.findElement(By.id(pr.getProperty("logout1"))).click();
driver.findElement(By.linkText(pr.getProperty("logout2"))).click();






		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
