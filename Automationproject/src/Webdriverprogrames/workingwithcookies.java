package Webdriverprogrames;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithcookies {
	
		FirefoxDriver driver;
		@BeforeTest
		public void open(){
			driver=new FirefoxDriver();
			driver.get("https://www.mirror.co.uk/");
		}
		
		@Test
		public void data(){
			
		Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println("no of cookies are"+"  "+mycookies.size());
		
		driver.manage().deleteAllCookies();
		
		mycookies=driver.manage().getCookies();
		System.out.println("no of cookies are"+"  "+mycookies.size());
		
		
		
		
		
		
		
		
		
	}

}
