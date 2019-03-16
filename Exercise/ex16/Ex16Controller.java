package ex16;

public class Ex16Controller extends Controller{
	Ex16 ex16 = new Ex16();
	
	public Ex16Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	protected void doStuff() {
		String input = this.myView.get("Enter a String: ");
		this.myView.say("The reverse of String \"" + input + "\" is \"" + ex16.ReverseString(input) +"\"");
	}
	
	
}
