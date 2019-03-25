package test3;

import java.util.Arrays;

public class Test3Controller extends Controller{
//	initialization of an object
	Test3 test3 = new Test3();

	public Test3Controller(VIew theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doStuff() {
		int[] intArray = {12, 56, 34, 79, 26};
		this.myView.say("Reversed Array is ");
		this.myView.add(Arrays.toString(test3.ReverseArray(intArray)));
	}
}
