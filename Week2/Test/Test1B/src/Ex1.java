
public class Ex1 {
	public String checkNumber(int num) {
		String result = "NOPE";
		if (num == 0) {
			return result;
		}
		else {
			if (num % 3 == 0) {
				result = "YES";
			}
		}
		
		return result;
	}
}
