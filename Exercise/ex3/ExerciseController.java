package ex3;

public abstract class ExerciseController {
	private String data;
	protected View myView;
	
	public ExerciseController(View theView) {
		this.myView = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		this.myView.start();
		this.doStuff();
		this.myView.stop();
	}

}
