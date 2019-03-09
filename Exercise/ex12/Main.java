package ex12;

public class Main {
	public static void main(String[] args) {
		VIew view = new ConsoleView();
		
		Controller ex12 = new Ex12Controller(view);
		
		ex12.go();
	}
}
