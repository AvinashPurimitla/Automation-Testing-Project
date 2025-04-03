import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("test failed with timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on test start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on TEst Finish");
		
	}

}
