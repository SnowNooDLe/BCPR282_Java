package ex15;

public class Ex15Controller extends Controller {
	Ex15 ex15 = new Ex15();
	
	public Ex15Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		int num = Integer.parseInt(this.view.get("Type the number you want to see the Tribonacci number"));
		this.view.say("The first " + num + " Tribonacci numbers are: \r\n" + 
						ex15.Tribonacci(num));
	}

}
