package ex17;

public class Ex17 {
	public String PhoneKeyPad(String userInput) {
		int digit = 0;
		String result = "";
		for (int i = 0; i < userInput.length(); i++) {
			switch(userInput.toLowerCase().charAt(i)) {
			case 'a': case 'b': case 'c': digit = 2; break;
			case 'd': case 'e': case 'f': digit = 3; break;
			case 'g': case 'h': case 'i': digit = 4; break;
			case 'j': case 'k': case 'l': digit = 5; break;
			case 'm': case 'n': case 'o': digit = 6; break;
			case 'p': case 'q': case 'r': case 's': digit = 7; break;
			case 't': case 'u': case 'v': digit = 8; break;
			case 'x': case 'y': case 'z': digit = 9; break;
			}
			result += digit;
		}
		
		return result;
	}
}
