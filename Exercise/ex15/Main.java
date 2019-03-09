package ex15;

public class Main {
	public static void main(String[] args) {
		VIew myView = new ConsoleView();
		
		Controller ex15 = new Ex15Controller(myView);
		
		ex15.go();
	}
}
