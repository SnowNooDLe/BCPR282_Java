package ex2;

public class Ex2 {
	public String CheckNumber(int number) {
		String result = "ODD Number";
		if (number % 2 == 0) {
			result = "EVEN Number";
		}
		
		return result;
	}
}
