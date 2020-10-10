package TestNGFramework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
System.out.println("TC start rsults are"+"  "+result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("TC Success results are"+"  "+result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("TC Failure results are"+"  "+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("TC skipped results are"+"   "+result.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
 System.out.println("TC TestFailedbutwithinsucc"+"   "+result.getName());		
	}

	@Override
	public void onStart(ITestContext result) {
  System.out.println("TC Start results are"+"  "+result.getName());		
	}

	@Override
	public void onFinish(ITestContext result) {
        System.out.println("TC on Finish results are"+"   "+result.getName());		
	}

	
	
	
}
