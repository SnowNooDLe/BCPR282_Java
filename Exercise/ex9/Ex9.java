package ex9;

public class Ex9 {
	public String SumgAndAverage(){
		int sum = 0;
		int count = 0;
		double average;
		int i = 1;
		String result;
		
		do{
			if (i % 7 == 0){
				sum += i;
			}
			i++;
			count++;
		} while (i <= 100);
		

		average = ((double)sum) / count;
		
		result = "The sum is " + sum + "\r\nThe average is " + average;
		return result;
	}
}
