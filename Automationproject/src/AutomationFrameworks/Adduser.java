package AutomationFrameworks;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Adduser {
	
	public Menu menu;
	
	public Adduser(WebDriver driver){
		
		menu=PageFactory.initElements(driver, Menu.class);
	}
	
     @FindBy(id="menu_pim_viewPimModule")
     WebElement pim;
     
     @FindBy(id="menu_pim_addEmployee")
     WebElement Addemp;
     
     @FindBy(name="firstName")
     WebElement fname;
     
     @FindBy(name="middleName")
     WebElement mname;
     
     @FindBy(name="lastName")
     WebElement lname;
     
     @FindBy(name="employeeId")
     WebElement id;
     
     @FindBy(name="btnSave")
     WebElement btn;
     
  public void Addusers(String f,String m,String l,String i){
	  
	  pim.click();
	  Addemp.click();
	  fname.sendKeys(f);
	  mname.sendKeys(m);
	  lname.sendKeys(l);
	  id.sendKeys(i);
	  btn.click();
	  
	  
	  
  }
     
     
     
     
     
     
     
     
	
	
}
