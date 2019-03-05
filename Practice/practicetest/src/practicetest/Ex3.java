package practicetest;

public class Ex3 {
	public String checkNum(int num)
	{
		String result = "Even Number";
		if (num % 2 == 1) {
			result = "Odd Number";
		}
		return result;
	}
	
	public int Product1toN(int num)
	{
		int result = 1;
		for (int i = 1; i<=num; i++) {
			result *= i;
		}
		return result;
		
	}
}
