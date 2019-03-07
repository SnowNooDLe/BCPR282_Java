package ex6;

public class Ex6Controller extends Controller{
	Ex6 ex6 = new Ex6();
	
	public Ex6Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		this.myView.say(ex6.SumAndAverage());
	}
	
}
