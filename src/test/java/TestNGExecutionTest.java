import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({MyListener.class})
public class TestNGExecutionTest {

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("1️ Before Suite");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("2️ Before Test");
	    }

	    @BeforeGroups("smoke")
	    public void beforeGroups() {
	        System.out.println("3️ Before Groups - Smoke Tests");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("4️ Before Class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("5️ Before Method");
	    }

	    @Test(groups = "smoke")
	    public void test1() {
	        System.out.println("6️ Test Method 1 (Smoke Test)");
	    }

	    @Test
	    public void test2() {
	        System.out.println("6️ Test Method 2 (Regular Test)");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("7️ After Method");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("8️ After Class");
	    }

	    @AfterGroups("smoke")
	    public void afterGroups() {
	        System.out.println("9️ After Groups - Smoke Tests");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("🔟 After Test");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("1️1️ After Suite");
	    }
	}



