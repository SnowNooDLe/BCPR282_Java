package ex1;

public abstract class ExerciseController {
	protected View myView;
	private String data;
	
	public ExerciseController (View theView) {
		this.myView = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		this.myView.start();
		this.doStuff();
		this.myView.stop();
	}
}
