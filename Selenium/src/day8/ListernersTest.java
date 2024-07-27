package day8;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersTest implements ITestListener   {
	
	 public void onTestStart(ITestResult result) {
		    System.out.println("On start method");
		  }

		  public void onTestSuccess(ITestResult result) {
		    System.out.println("on test success method");
		  }

		
		  public void onTestFailure(ITestResult result) {
		    System.out.println("on test failure method:" +result.getName());
		  }

		 
		  public void onTestSkipped(ITestResult result) {
		    System.out.println("on test skipped method:" +result.getName());
		  }


		 
		  public void onTestFailedWithTimeout(ITestResult result) {
 		    onTestFailure(result);
		  }

		 
		  public void onStart(ITestContext context) {
		    System.out.println("on start method");
		  }

		  public void onFinish(ITestContext context) {
		    System.out.println("on finish method");
		  }
		}


