package TestNGFrameworkProg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
    System.out.println("TC on Test Start results are"+"   "+result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
          System.out.println("TC on Test Succ results are"+"     "+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("TC on Test Failure results"+"   "+result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("TC on Test Skipped results are"+"   "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
System.out.println("TC on Test Failed but with Succ precen results are"+"   "+result.getName());		
	}

	@Override
	public void onStart(ITestContext result) {
System.out.println("TC on Start results are"+"   "+result.getName());		
	}

	@Override
	public void onFinish(ITestContext result) {
System.out.println("TC on Test context results are"+result.getName());		
	}
	
	
	
	

}
