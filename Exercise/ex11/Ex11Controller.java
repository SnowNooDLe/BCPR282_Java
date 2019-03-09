package ex11;

public class Ex11Controller extends Controller {
	public Ex11Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}

	Ex11 ex11 = new Ex11();
	
	@Override
	protected void doStuff() {
		int num = Integer.parseInt(this.view.get("Put the number you want to be caluclated"));
		this.view.say("The product 1 to " + num + " is " + ex11.Product1toN(num));
	}
	
	
}
