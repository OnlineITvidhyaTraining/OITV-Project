package AutomationFrameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DriverscriptforHRM {

	@Test
	public void operation() throws IOException, InterruptedException{
	ActionKeywords2 key=new ActionKeywords2();
	
	FileInputStream fso=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ActionKeywords.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fso);
	XSSFSheet wso=wbo.getSheet("sheet1");
	
	Row r;

	int rowc=wso.getLastRowNum();
	for(int i=1;i<=rowc;i++){
	
		r=wso.getRow(i);
	String runmode=r.getCell(4).getStringCellValue();
	    if(runmode.equals("Y")){
	    	String Action=r.getCell(3).getStringCellValue();
	    	 if(Action.equals("open")){
	    		  key.open();
	    	 }
	    	 else if(Action.equals("login")){
	    	       key.login("Admin", "admin123");
	    	 }
	    	 else if(Action.equals("Adduser")){
	    		 key.Adduser("Ramakrishna","QA","Testing Eng", "007");
	    	 }
	    	 else if(Action.equals("checkstatus")){
	    		 key.checkstatus();
	    	 }
	    	 else if(Action.equals("logout")){
	    		 key.logout();
	    	 }
	    	 else if(Action.equals("close")){
	    		 key.close();
	    	 }
	    	 
	 
	    	 
	    	 
	    		 
	    	 }
	    	
	    }
	
	
	
	
	
	
	
}
}
