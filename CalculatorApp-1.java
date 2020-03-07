import java.lang.reflect.Array;
import java.util.Arrays;
import java.io.*;

public class CalculatorApp {

	public static void main(String[] args) {
		int i, j;
		int[] arr = new int[]{1, 6, 8};
		int n = 3;
		CalculatorWithStats obj = new CalculatorWithStats();
		obj.add(arr[1],arr[2]);
		obj.add(arr[2],arr[1]);
		obj.sub(arr[1],arr[2]);
		obj.sub(arr[2], arr[1]);
		obj.mult(arr[1],arr[2]);
		obj.mult(arr[2],arr[1]);
		obj.div(arr[1],arr[2]);
		obj.div(arr[2], arr[1]);
		obj.add(arr[0],arr[2]);
		obj.add(arr[2],arr[0]);
		obj.sub(arr[0],arr[2]);
		obj.sub(arr[2], arr[0]);
		obj.mult(arr[0],arr[2]);
		obj.mult(arr[2],arr[0]);
		obj.div(arr[0],arr[2]);
		obj.div(arr[2], arr[0]);
		obj.add(arr[0],arr[1]);
		obj.add(arr[1], arr[0]);
		obj.sub(arr[0],arr[1]);
		obj.sub(arr[1], arr[0]);
		obj.mult(arr[0],arr[1]);
		obj.mult(arr[1], arr[0]);
		obj.div(arr[0],arr[1]);
		obj.div(arr[1], arr[0]);
		obj.avg(arr);
		obj.sum(arr);
System.out.println("The addition of input 2 and 3 is: " +obj.add(arr[1], arr[2]));
System.out.println("The addition of input 3 and 2 is: " +obj.add(arr[2], arr[1]));
System.out.println("The difference of input 2 and 3 is: " +obj.sub(arr[1], arr[2]));
System.out.println("The difference of input 3 and 2 is: " +obj.sub(arr[2], arr[1]));
System.out.println("The product of input 2 and 3 is:" +obj.mult(arr[1], arr[2]));
System.out.println("The product of input 3 and 2 is:" +obj.mult(arr[2], arr[1]));
System.out.println("The difference of input 2 and 3 is: " +obj.div(arr[1], arr[2]));
System.out.println("The difference of input 3 and 2 is: " +obj.div(arr[2], arr[1]));

System.out.println("The addition of input 1 and 3 is: " +obj.add(arr[0], arr[2]));
System.out.println("The addition of input 3 and 1 is: " +obj.add(arr[2], arr[0]));
System.out.println("The difference of input 1 and 3 is: " +obj.sub(arr[0], arr[2]));
System.out.println("The difference of input 3 and 1 is: " +obj.sub(arr[2], arr[0]));
System.out.println("The product of input 1 and 3 is:" +obj.mult(arr[0], arr[2]));
System.out.println("The product of input 3 and 1 is:" +obj.mult(arr[2], arr[0]));
System.out.println("The difference of input 1 and 3 is: " +obj.div(arr[0], arr[2]));
System.out.println("The difference of input 3 and 1 is: " +obj.div(arr[2], arr[0]));

System.out.println("The addition of input 2 and 1 is: " +obj.add(arr[1], arr[0]));
System.out.println("The addition of input 1 and 2 is: " +obj.add(arr[0], arr[1]));
System.out.println("The difference of input 2 and 1 is: " +obj.sub(arr[1], arr[0]));
System.out.println("The difference of input 1 and 2 is: " +obj.sub(arr[0], arr[1]));
System.out.println("The product of input 2 and 1 is:" +obj.mult(arr[1], arr[0]));
System.out.println("The product of input 1 and 2 is:" +obj.mult(arr[0], arr[1]));
System.out.println("The difference of input 2 and 1 is: " +obj.div(arr[1], arr[0]));
System.out.println("The difference of input 1 and 2 is: " +obj.div(arr[0], arr[1]));

System.out.println("The average of all three inputs is: " +obj.avg(arr));
System.out.println("The sum of all three inputs is: " +obj.sum(arr));

	}
}
