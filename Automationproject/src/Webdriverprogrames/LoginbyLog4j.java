package Webdriverprogrames;

	import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	public class LoginbyLog4j {
	private static Logger log=Logger.getLogger(LoginbyLog4j.class);
	
		FirefoxDriver driver;
		@BeforeTest
		public void open(){
			DOMConfigurator.configure("log4j.xml");
			driver=new FirefoxDriver();
			log.info("browser open succ");
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			log.info("page nvigated succ");
		}
		@Test
		public void login() throws InterruptedException{
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			log.info("Username inserted succ");
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			log.info("password inserted succ");
			
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			log.info("Succ login completed");
		}
		@Test(priority=1)
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
			driver.close();
		}
}
