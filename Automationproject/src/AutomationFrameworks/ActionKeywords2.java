package AutomationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionKeywords2 {
FirefoxDriver driver;
	
	@BeforeTest
	
	public void open()   {
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void login(String u,String p) throws InterruptedException  {
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(p);
	
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);

	}
	
	@Test(priority=1)
	public void Adduser(String f,String m,String l,String I){
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	
	driver.findElement(By.name("firstName")).sendKeys(f);
	driver.findElement(By.name("middleName")).sendKeys(m);
	driver.findElement(By.name("lastName")).sendKeys(l);
	driver.findElement(By.name("employeeId")).sendKeys(I);
	
	driver.findElement(By.id("btnSave")).click();
	
	
	
	
	}
	@Test(priority=2)
	public void checkstatus() throws InterruptedException  {
		String Expected="Welcome abc";
		String Actual=driver.findElement(By.linkText("Welcome abc")).getText();
			
	Assert.assertEquals(Expected, Actual);	
	Thread.sleep(3000);
	}
	@Test(priority=3)
	public void logout(){
		driver.findElement(By.linkText("Welcome abc")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
}
