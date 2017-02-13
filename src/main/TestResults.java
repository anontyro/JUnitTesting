package main;


public class TestResults{

	public int mean(int... input){
		
		int result = 0;
		
		for (int arg : input) {
			result += arg;
		}
		
		int output = (result / input.length);
		
		return output;
	}
	
}
