package ex11;

public class Main {
	public static void main(String[] args) {
		VIew theView = new ConsoleView();
		
		Controller ex11 = new Ex11Controller(theView);
		
		ex11.go();
	}
}
