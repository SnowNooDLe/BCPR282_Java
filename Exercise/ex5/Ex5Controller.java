package ex5;

public class Ex5Controller extends Controller {
	Ex5 ex5 = new Ex5();
	
	public Ex5Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}


	@Override 
	protected void doStuff(){
		this.myView.say(ex5.SumAndAverage());
	}
}
