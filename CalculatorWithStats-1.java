import java.lang.reflect.Array;
import java.util.Arrays;

public class CalculatorWithStats extends Calculator implements StatCalculator {
	
	public double avg(int[] x) {
		CalculatorApp array = new CalculatorApp();
		int[] arr = x;
		int sum = 0;  
		int i;
		for (i = 0; i < arr.length; i++) 
			sum +=  arr[i]; 

		double avg = sum/arr.length;
		
			return avg;
	}
	public double sum(int[] x) {
		CalculatorApp array = new CalculatorApp();
		int[] arr = x;
			int sum = 0;  
			int i;  
				for (i = 0; i < arr.length; i++) 
					sum +=  arr[i]; 
       
					return sum;
				}
}