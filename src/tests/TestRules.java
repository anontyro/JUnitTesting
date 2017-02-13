package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Keep methods that are being reused in this class
 * @author Alex
 *
 */
public class TestRules {
	
	//forces the test to be re-ran for X number of times
	@Rule
	public RetryTest retry = new RetryTest(4);
	
	//method executed before the test
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Test begins");
	}
	
	//method executed after the class
	@AfterClass
	public static void afterClass(){
		System.out.println("End of Test \n");
	}
	
	//what happens if the test fails or succeeds 
	@Rule
	public TestRule listen = new TestWatcher(){
		
		@Override
		public void failed(Throwable t, Description description){
			//logic on what happens in failure
			System.out.println("Test failed " + description.getMethodName());
		}
		
		@Override public void succeeded(Description description){
			//logic on what happens in success
			System.out.println("Test passed " +description.getMethodName());
		}
		
	};
	
	
	
	

}
