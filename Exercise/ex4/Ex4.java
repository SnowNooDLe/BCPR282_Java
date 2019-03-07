package ex4;

public class Ex4 {
	public String SumAndAverage(){
		int sum = 0;
		double average;
		String result;
		for (int i = 1; i <= 100; i++){
			sum += i;
		}
		average = ((double)sum) / 100;
		result = "The sum is " + sum + "\r\nThe average is " + average;
		return result;
	}
}
