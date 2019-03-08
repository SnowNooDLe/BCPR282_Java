
public abstract class Controller {
	protected View myView;
	
	public Controller(View theView) {
		this.myView = theView;
	}
	
	protected abstract void doStuff();
	
	public void go() {
		this.myView.start();
		this.doStuff();
		this.myView.stop();
	}
	

}
