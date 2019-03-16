package ex16;

public class Ex16 {
	public String ReverseString(String input) {
		String reversed = "";
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		return reversed;
	}
}
