package ex14;

public class Ex14Controller extends Controller{
	public Ex14Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}

	Ex14 ex14 = new Ex14();
	
	@Override
	protected void doStuff() {
		int num = Integer.parseInt(this.myView.get("Type the number you want to see the Fiboncaai number"));
		this.myView.say("The first " + num + " Fibonacci numbers are: \r\n" + 
						ex14.Fibonacci(num));
	}
}
