package Webdriverprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openFF {

	public static void main(String[] args) {
	
//System.setProperty("webdriver.firefox.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://shaadi.com");
		
	
	
	}

}
