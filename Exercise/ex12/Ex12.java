package ex12;

public class Ex12 {
	public String HarmonicSum(int num) {
		double result_LTR = 0.0;
		double result_RTL = 0.0;
		String result;
		
//		for Left to Right
		for (int i = 1; i <= num; i++) {
			result_LTR += (double)1/i;
		}
//		for Right to Left
		for (int j = num; j >= 1; j--) {
			result_RTL += (double)1/j;
		}
		
		result = "The Harmonic Sum from Left to Right is " + result_LTR + "\r\nThe Harmonic Sum from Right to Left is " + result_RTL;
		
		return result;
	}
}
