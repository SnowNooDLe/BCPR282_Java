package ex5;

public class Ex5 {
	public String SumAndAverage(){
		int sum = 0;
		double average;
		String result;
		
		int i = 1;
		while (i <= 100){
			sum += i;
			i++;
		}

		average = ((double)sum) / 100;
		
		result = "The sum is " + sum + "\r\nThe average is " + average;
		return result;
	}
}
