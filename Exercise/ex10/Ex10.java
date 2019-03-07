package ex10;

public class Ex10 {
	public String SumAndAverage(){
		int sum = 0;
		int count = 0;
		double average;
		int i = 1;
		String result;
		
		do{
			sum += i * i;
			i++;
			count++;
		} while (i <= 100);
		
		average = ((double)sum) / count;
		
		result = "The sum is " + sum + "\r\nThe average is " + average;
		return result;
	}
}
