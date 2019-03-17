package ex19;

public class Ex19Controller extends Controller{
	Ex19 ex19 = new Ex19();
	
	public Ex19Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		int userInput = this.myView.get("Enter the number of students: ");
		this.myView.say("The average is : " + ex19.GradesAverage(userInput));
	}
	
}
