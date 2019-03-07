package ex6;

public class Ex6 {
	public String SumAndAverage(){
		int sum = 0;
		double average;
		int i = 1;
		String result;
		
		do{
			sum += i;
			i++;
		} while (i <= 100);
		

		average = ((double)sum) / 100;
		
		result = "The sum is " + sum + "\r\nThe average is " + average;
		return result;
	}
}
