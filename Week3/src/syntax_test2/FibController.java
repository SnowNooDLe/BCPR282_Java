package syntax_test2;

public class FibController extends Controller{
	Fib fib = new Fib();
//	class with constructor
	public FibController(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		int num = Integer.parseInt(this.myView.get("Put the integer, lowest possible value is 3: "));
		if (num < 3) {
			this.myView.say("It cannot be lower then 3");
			this.doStuff();
		} else {
			this.myView.say(fib.getValues(num));
		}
	}

}
