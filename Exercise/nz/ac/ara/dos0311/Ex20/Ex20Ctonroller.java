package nz.ac.ara.dos0311.Ex20;

public class Ex20Ctonroller extends Controller{
	Ex20 ex20 = new Ex20();

	public Ex20Ctonroller(VIew theView) {
		super(theView);
	}
	
	protected void doStuff() {
		int input = Integer.parseInt(this.myView.get("Enter the number of students"));
		ex20.GradeStatistics(input);
	}

}
