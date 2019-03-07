package ex4;

public class Ex4ExerciseController extends ExerciseController{
	Ex4 ex4 = new Ex4();
	
	public Ex4ExerciseController(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		this.myView.say(ex4.SumAndAverage());
	}

}
