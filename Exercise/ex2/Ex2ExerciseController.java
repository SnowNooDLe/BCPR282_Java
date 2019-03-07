package ex2;

public class Ex2ExerciseController extends ExerciseController{
	Ex2 ex2 = new Ex2();
	
	public Ex2ExerciseController(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		for (int i = 1; i <= 10; i++) {
			this.myView.say(i + " is an " + ex2.CheckNumber(i));
		}
	}

}
