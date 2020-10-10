package Webdriverprogrames;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGProg {
	
	@BeforeTest
	public void data(){
		System.out.println("Openbrowser navigate to url");
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
		System.out.println("daily report prepare");
	}
	
	@Test(priority=3,enabled=false)
	public void sendreport(){
		System.out.println("send to TL");
	}
	
	@Test(priority=4)
	public void logout(){
		System.out.println("logout from application");
	}
	
	@AfterTest
	public void close(){
		System.out.println("close from Application");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
