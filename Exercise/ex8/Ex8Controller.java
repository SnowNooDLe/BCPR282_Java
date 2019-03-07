package ex8;

public class Ex8Controller extends Controller{

	public Ex8Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	Ex8 ex8 = new Ex8();
	
	@Override
	protected void doStuff() {
		this.myView.say(ex8.SumAndAverage());
	}
}
