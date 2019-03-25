package nz.ac.ara.dos0311.Test4;

public class NumberHider {
	protected Integer secretNumber = 0;	
	int counting = 0;
//	constructor with parameter so when class is created with parameter, that is the secret number
	public NumberHider(int y) {
		secretNumber = y;
	}
//	constructor without parameter, when class is created without parameter, computer generate random number between 0 and 99.
	public NumberHider() {
		secretNumber = (int)(Math.random()*100);
	}
	
	public String makeGuess(int value) {
		
		String result;
		counting++;
		if (this.secretNumber < value) {
			result = "Try lower";
		} else if (this.secretNumber > value){
			result = "Try higher";
		} else {
			result = "You got it in " + counting + " trials!";
		}
		
		System.out.println(counting);
		return result;
	}

}
