package ex3;

public class Ex3_nested {
	public String PrintWord_nested(int number) {
		String numberString;
		switch (number) {
			case 1: numberString = "ONE";
					break;
			case 2: numberString = "TWO";
					break;
			case 3: numberString = "THREE";
					break;
			case 4: numberString = "FOUR";
					break;
			case 5: numberString = "FIVE";
					break;
			case 6: numberString = "SIX";
					break;
			case 7: numberString = "SEVEN";
					break;
			case 8: numberString = "EIGHT";
					break;
			case 9: numberString = "NINE";
					break;
			default: numberString = "OTHER";
					break;
		}
		return numberString;
	}
}
