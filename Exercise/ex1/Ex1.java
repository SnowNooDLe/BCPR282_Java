package ex1;

public class Ex1 {
	public String CheckMark(int mark) {
		String result = "PASS";
		if (mark < 50) {
			result = "FAIL";
		}
		return result;
	}
}
