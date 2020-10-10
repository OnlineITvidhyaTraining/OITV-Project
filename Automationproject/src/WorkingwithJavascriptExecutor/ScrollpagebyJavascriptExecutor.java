package WorkingwithJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollpagebyJavascriptExecutor {

	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void task(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,5000)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		js.executeScript("document.getElementById('pass').scrollIntoView()");
		
		
		
	}

}
