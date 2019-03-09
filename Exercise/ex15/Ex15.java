package ex15;

public class Ex15 {
	public String Tribonacci(int num) {
		int fibNum = 0;
		double average = 0.0;
//		because if n = 1 or 2, then return value is 1 anyway, so start from n(3), then its already counted 2
		int count = 3;
		String output = "1 1 2 ";
		int total = 2;
//		first mean n-3 value
		int firstNum = 1;
//		second mean n-2 value
		int secondNum = 1;
//		third mean n-1 value
		int thirdNum = 2;
		
		for (int i = 4; i <= num; i++) {
			if (num == 1 || num == 2 || num == 3) {
				output += Integer.toString(1);
				average = 1.0;
			} else {
				fibNum = firstNum + secondNum + thirdNum;
				output += Integer.toString(fibNum) + " ";
				total += fibNum;
				firstNum = secondNum;
				secondNum = thirdNum;
				thirdNum = fibNum;
				count++;
			}
		}
		average = (double)total/(double)count;
		return output + "\r\nThe average is " + average;
	}
}
