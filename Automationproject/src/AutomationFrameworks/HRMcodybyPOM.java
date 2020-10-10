package AutomationFrameworks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMcodybyPOM {

	FirefoxDriver driver;
	HRMLogin page1;
	Adduser page2;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void script() throws InterruptedException{
		page1=PageFactory.initElements(driver, HRMLogin.class);
		page2=PageFactory.initElements(driver, Adduser.class);
		page1.login("Admin", "admin123");
		Thread.sleep(3000);
		
	     page2.Addusers("Ramakrishna", "QA", "Tester", "007");
		
	}
	
	
	
	
	
}
