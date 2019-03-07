package ex7;

public class Ex7 {
	public String SumAndAverage(){
		int sum = 0;
		int count = 0;
		double average;
		int i = 111;
		String result;
		
		do{
			sum += i;
			i++;
			count++;
		} while (i <= 8989);
		
		average = ((double)sum) / count;
		
		result = "The sum is " + sum + "\r\nThe average is " + average;
		return result;
	}
}
