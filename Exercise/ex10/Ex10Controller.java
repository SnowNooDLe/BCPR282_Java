package ex10;

public class Ex10Controller extends Controller {
	Ex10 ex10 = new Ex10();
	
	public Ex10Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		this.myView.say(ex10.SumAndAverage());
	}
	
}
