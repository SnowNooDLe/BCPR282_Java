package ex19;

public abstract class Controller {
	protected VIew myView;
	
	public Controller (VIew theView) {
		this.myView = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		this.doStuff();
	}
}
