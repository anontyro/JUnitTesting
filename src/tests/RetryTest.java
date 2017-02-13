package tests;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Unit test retry class that is used to rerun the test X number of times to ensure
 * the test is valid
 * @author Alex
 *
 */
public class RetryTest implements TestRule{

	private int count;
	
	public RetryTest(int count){
		this.count = count;
	}
	
	@Override
	public Statement apply(Statement base, Description description){
		return statement(base,description);
	}
	
	private Statement statement(final Statement base, final Description description){
		return new Statement(){
			@Override
			public void evaluate()throws Throwable{
				Throwable throwable = null;
				for (int i = 0; i < count; i++) {
					try{
						
						base.evaluate();
						return;
						
					}catch(Throwable e){
						throwable = e;
						System.out.println("Test ran "+(i+1) + " failed");
					}
				}
				System.out.println("Giving up after: " +count + " failures" );
				throw throwable;
				
			}
		};

	}
	
	
	
}
	
