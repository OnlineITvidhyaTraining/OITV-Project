package AutomationFrameworks;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLogin {
	
	public Menu menu;
	
	public HRMLogin(WebDriver driver){
		
		menu=PageFactory.initElements(driver, Menu.class);
	}
	
	@FindBy(id="txtUsername")
	WebElement user;
	
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement log;
	
	
	public void login(String u,String p){
		user.sendKeys(u);
		pass.sendKeys(p);
		log.click();
	}

}
