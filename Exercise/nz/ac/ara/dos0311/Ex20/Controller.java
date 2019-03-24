package nz.ac.ara.dos0311.Ex20;

public abstract class Controller{
	protected VIew myView;
	
	public Controller(VIew theView) {
		this.myView = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		this.doStuff();
	}
	
}
