package ex14;

public class Ex14 {
	public String Fibonacci(int num) {
		int fibNum = 0;
		double average = 0.0;
//		because if n = 1 or 2, then return value is 1 anyway, so start from n(3), then its already counted 3
		int count = 2;
		String output = "1 1 ";
		int total = 2;
//		first mean n-2 value
		int firstNum = 1;
//		second mean n-1 value
		int secondNum = 1;
		
		for (int i = 3; i <= num; i++) {
			if (num == 1 || num == 2) {
				output += Integer.toString(1);
				average = 1.0;
			} else {
				fibNum = firstNum + secondNum;
				output += Integer.toString(fibNum) + " ";
				total += fibNum;
				firstNum = secondNum;
				secondNum = fibNum;
				count++;
			}
		}
		average = (double)total/(double)count;
		return output + "\r\nThe average is " + average;
	}
}
