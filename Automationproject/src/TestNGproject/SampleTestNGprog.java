package TestNGproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGprog {
	
	@BeforeTest
	public void openbrowser(){
	
		System.out.println("open brower navigate to Page");			
	}	
	@Test(priority=0,enabled=false)
	public void register(){
		System.out.println("register for new Account");
	}
	@Test(priority=1)
	public void login(){
		System.out.println("login for next operation");
	}
	
	@Test(priority=2)
	public void dailyreport(){
		System.out.println("daily report Prepare");
	}
	@Test(priority=3)
	public void sendtoTL(){
		System.out.println("Report send to TL");
	}
	@Test(priority=4)
	public void logout(){
		System.out.println("Logout from Application");
	}
	
	@AfterTest
	public void close(){
		System.out.println("close browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
