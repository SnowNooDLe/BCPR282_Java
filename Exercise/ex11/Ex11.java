package ex11;

public class Ex11 {
	public int Product1toN (int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}
}
