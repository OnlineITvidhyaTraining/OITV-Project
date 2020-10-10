package SeleniumProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMloginbyProperties {
	
	FirefoxDriver driver;
	FileInputStream fso;
	Properties pr;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test
	public void data() throws IOException, InterruptedException{
		
fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\lockdown\\Automationproject\\Login.properties");		
 pr=new Properties();	
pr.load(fso);		
		
driver.findElement(By.id(pr.getProperty("User"))).sendKeys("Admin");
driver.findElement(By.id(pr.getProperty("Pass"))).sendKeys("admin123");
driver.findElement(By.id(pr.getProperty("btn"))).click();

Thread.sleep(4000);

driver.findElement(By.id(pr.getProperty("logout1"))).click();
driver.findElement(By.linkText(pr.getProperty("logout2"))).click();




	}
	
	
	
	

}
