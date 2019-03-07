package ex7;

public class Ex7Controller extends Controller{
	Ex7 ex7 = new Ex7();
	
	public Ex7Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		this.myView.say(ex7.SumAndAverage());
	}

}
