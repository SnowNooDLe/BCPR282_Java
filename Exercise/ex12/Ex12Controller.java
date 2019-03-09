package ex12;

public class Ex12Controller extends Controller{
	Ex12 ex12 = new Ex12();
	
	public Ex12Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		int num = Integer.parseInt(this.myView.get("Type 50000 like eg asked"));
		this.myView.say(ex12.HarmonicSum(num));
	}

}
