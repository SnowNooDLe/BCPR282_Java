package ex6;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex6 = new Ex6Controller(view);
		ex6.go();
		
	}
}
