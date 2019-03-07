package ex1;

public class Ex1Controller extends ExerciseController{
	Ex1 ex1 = new Ex1();
	
	public Ex1Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		this.myView.say(ex1.CheckMark(60));
	}

}
