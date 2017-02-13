package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.TestResults;

public class TestResultsTest extends TestRules{
	
	private TestResults studentResults;

	@Before
	public void setUp() throws Exception {
		
		studentResults = new TestResults();
		
	}

	@Test
	public void testMean() {
		int result = (1 + 5+ 7+ 9+ 10) / 5;
		
		assertEquals(result, studentResults.mean(1,5,7,9,10));
		
		result = (1)/1;
		assertEquals(result, studentResults.mean(1));
		
		result = (0)/1;
		assertEquals(result, studentResults.mean(0));
		
		result = (1+ 6+ 6+ 9+ 10+ 54) / 6;
		assertEquals(result, studentResults.mean(1, 6, 6, 9, 10, 54));
		
	}

}
