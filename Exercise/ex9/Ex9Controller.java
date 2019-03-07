package ex9;

public class Ex9Controller extends Controller {
	Ex9 ex9 = new Ex9();
	
	public Ex9Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doStuff() {
		this.myView.say(ex9.SumgAndAverage());
	}
}
