package ex9;

public abstract class Controller {
	protected View myView;
	private String data;
	
	public Controller (View theView) {
		this.myView = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		this.myView.start();
		this.doStuff();
		this.myView.stop();
	}
}
