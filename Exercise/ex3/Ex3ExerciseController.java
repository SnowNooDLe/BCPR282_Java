package ex3;

public class Ex3ExerciseController extends ExerciseController{
	Ex3 ex3_a = new Ex3();
	Ex3_nested ex3_b = new Ex3_nested();
	
	public Ex3ExerciseController(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doStuff() {
		System.out.println("This is nested if");
		for (int i = 1; i<=10; i++) {
			this.myView.say(i + " is an " + ex3_a.PrintWord(i));
		}
		
		System.out.println("This is switch case");
		for (int i = 1; i<=10; i++) {
			this.myView.say(i + " is an " + ex3_b.PrintWord_nested(i));
		}
	}

}
