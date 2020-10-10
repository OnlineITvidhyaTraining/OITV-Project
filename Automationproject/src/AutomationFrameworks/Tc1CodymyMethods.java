package AutomationFrameworks;

import org.testng.annotations.Test;

public class Tc1CodymyMethods {
	
	Reusablemethods methods1;
	@Test
	public void data() throws InterruptedException{
		
	methods1=new Reusablemethods();
	
	//open browser
	methods1.open();
	
	//login
	methods1.login("Admin","admin123");
	
	
	//Add EMP
	methods1.Adduser("Ramakrishna", "QA", "SR Test consultent", "0088");
	
	
	//verify login status
	methods1.checkstatus();
	
	
	//logout
	methods1.logout();
	
	//close
	methods1.close();
	
	
	
	
	
		
		
		
		
	}

}
