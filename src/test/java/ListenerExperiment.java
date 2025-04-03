import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({MyListener.class})
public class ListenerExperiment {
	@Test
	public void methodA() {
		System.out.println("method"+"A"+"executed");
	}
	@Test(retryAnalyzer =MyRetryAnalyzer.class)
	public void methodB()
	{
		String name="avinash";
		Assert.assertEquals(name, "avinas");
		
	
	
	}
}
