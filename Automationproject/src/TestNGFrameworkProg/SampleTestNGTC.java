package TestNGFrameworkProg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTC {
	@BeforeTest
	public void open(){
		System.out.println("open browser navigate to url");
	}	
	@Test(enabled=false)
	public void register(){
		System.out.println("register for new Account");
	}
	@Test(priority=1)
	public void login(){
		System.out.println("login for next operation");
	}
	@Test(priority=2,enabled=false)
	public void dailyreport(){
		System.out.println("Prepare Daily Report");
	}
	
	@Test(priority=3)
	public void sendreport(){
		System.out.println("send Report to TL");
	}
	@Test(priority=4)
	public void logout(){
		System.out.println("logout from Application");
	}
	
	@AfterTest
	public void close(){
		System.out.println("close browser");
	}
	
	
	
	
	
	

}
