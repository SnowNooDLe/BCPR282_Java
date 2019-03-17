package ex17;

public class Ex17Controller extends Controller{
	
	Ex17 ex17 = new Ex17();
	
	public Ex17Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		String userInput = this.myView.get("Put string you want to convert :");
		this.myView.say("It is : " + ex17.PhoneKeyPad(userInput));
	}
}
