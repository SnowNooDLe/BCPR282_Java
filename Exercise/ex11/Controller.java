package ex11;

public abstract class Controller {
	protected VIew view;
	private String data;
	
	public Controller (VIew theView) {
		this.view = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		this.view.start();
		this.doStuff();
		this.view.stop();
	}
}
