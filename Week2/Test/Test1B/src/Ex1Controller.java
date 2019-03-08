
public class Ex1Controller extends Controller {
	Ex1 ex1 = new Ex1();
	
	public Ex1Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doStuff() {
		int max = Integer.parseInt(this.myView.get("Enter the max value"));
		for (int i = 0; i<=max; i++) {
			this.myView.say(i + " is " + ex1.checkNumber(i));
		}
	}
}
