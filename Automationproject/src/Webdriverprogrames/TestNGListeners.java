package Webdriverprogrames;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
System.out.println("Test case Start results are"+"  "+result.getName());	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
System.out.println("Test case Success results are" +"   "+result.getName());		
	}
	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("TC Failure Results are"+"   "+result.getName());		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("TC Skipped results are"+"    "+result.getName());		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
System.out.println("FailedButWithinSuccessPercentage results are"+"   "+result.getName());		
	}

	@Override
	public void onStart(ITestContext result) {
System.out.println("on start results are"+"   "+result.getName());		
	}

	@Override
	public void onFinish(ITestContext result) {
System.out.println("on Finish results are"+"   "+result.getName());		
	}
	
	
	
	

}
