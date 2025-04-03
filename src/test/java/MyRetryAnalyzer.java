import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	int count=0;
	int retry=5;

	@Override
	public boolean retry(ITestResult result) {
		if(count<retry) {
			count++;
			return true;
		}
		return false;
	}

}
