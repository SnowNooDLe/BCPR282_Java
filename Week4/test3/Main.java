package test3;

public class Main {
	public static void main(String[] args) {
		VIew theView = new ConsoleView();
		Controller test3 = new Test3Controller(theView);
		
		test3.go();
	}
}
