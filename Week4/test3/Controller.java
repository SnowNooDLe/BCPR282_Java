package test3;

public abstract class Controller {
	protected VIew myView;
	
	public Controller(VIew theView) {
		this.myView = theView;
	}
	
	protected abstract void doStuff();
	
	public void go() {
		this.doStuff();
	}
}
