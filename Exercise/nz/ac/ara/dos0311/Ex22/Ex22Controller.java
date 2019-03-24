package nz.ac.ara.dos0311.Ex22;

public class Ex22Controller extends Controller{
	public Ex22Controller(VIew theView) {
		super(theView);
	}

	Ex22 ex22 = new Ex22();
	
	@Override
	protected void doStuff() {
		ex22.NumberGuess();
	}
	
}
