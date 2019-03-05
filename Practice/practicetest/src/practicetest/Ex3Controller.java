package practicetest;

public class Ex3Controller extends Controller {
	
	Ex3 ex3 = new Ex3();
	
	public Ex3Controller(View theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff()
	{
		for (int i = 0; i<=10; i++)
		{
			this.myView.say(i + " is an " + ex3.checkNum(i));
		}
		
		for (int i = 0; i<=10; i++)
		{
			this.myView.say(i + " is an " + ex3.Product1toN(i));
		}
	}

}
