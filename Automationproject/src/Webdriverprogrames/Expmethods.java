package Webdriverprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Expmethods {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
    driver.manage().window().maximize();
		
	}

}
