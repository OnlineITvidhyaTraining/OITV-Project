package TestNGFramework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTC {
@BeforeTest
public void open(){
	System.out.println("Open browser navigate to url");
}
@Test(enabled=false)
public void register(){
	System.out.println("register for New Account");
}
@Test(priority=1)
public void login(){
	System.out.println("login for next operation");
}	
@Test(priority=2,enabled=false)
public void dailyreport(){
	System.out.println("daily report Prepare");
}
@Test(priority=3)
public void sendreport(){
	System.out.println("send report to TL");
}
@Test(priority=4)
public void logout(){
	System.out.println("logout from Application");
}
@AfterTest
public void close(){
	System.out.println("Close from Application");
}

}
