package syntax_test2;

import java.util.ArrayList;

public class Fib {
	public ArrayList<Integer> Fibonacci(int num) {
//		three different variables ? ArrayList, int, and result in getValues method ?
//		Used ArrayList to store fibonacci numbers
		ArrayList<Integer> fibonacciNums = new ArrayList<Integer>();
//		initialization
		int firstNum = 1;
		int secondNum = 1;
		int fibNum = 0;
//		n - 2 value
		fibonacciNums.add(firstNum);
//		n - 1 value
		fibonacciNums.add(secondNum);
//		because our assumption is n has a lowest possible value of 3
		for (int i = 3; i <= num; i++) {
			fibNum = firstNum + secondNum;
			fibonacciNums.add(fibNum);
			firstNum = secondNum;
			secondNum = fibNum;
		}
		return fibonacciNums;
	}
	
	public String getValues(int num) {
		ArrayList<Integer> fibonacciResults = this.Fibonacci(num);
		String result = "";
//		because index in Java starts from 0 so need to minus 1 to get into the 20th value
		for (int i = 0; i<= num-1; i++) {
			result += fibonacciResults.get(i) + " ";
		}
//		try to play with this which is enhanced for loop
		for (Integer values: fibonacciResults) {
			result += values
		}
		return result;
		
	}
}
