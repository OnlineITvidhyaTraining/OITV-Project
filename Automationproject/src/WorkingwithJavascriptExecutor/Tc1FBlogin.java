package WorkingwithJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1FBlogin {
	
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
	}
	@Test
	public void operation() throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("document.getElementById('email').value='QA123'");
	//js.executeScript("document.getElementById('pass').value='i dont know'");
	//js.executeScript("document.getElementById('u_0_b').click()");
		driver.navigate().to("http://google.com");
		
		js.executeScript("window.history.back()");
		
		Thread.sleep(5000);
		
		//get title of page
		String title1=js.executeScript("return document.title").toString();
		System.out.println(title1);
		Thread.sleep(3000);

		js.executeScript("window.history.forward()");
		
		
		
		

		
		
		
	}
	

}
