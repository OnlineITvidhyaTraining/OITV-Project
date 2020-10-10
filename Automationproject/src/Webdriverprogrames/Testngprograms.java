package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprograms {
	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void click(){
		driver.findElement(By.linkText("Gmail"));
		
	}
	
	
	

}
