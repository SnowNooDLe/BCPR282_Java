package ex9;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex9 = new Ex9Controller(view);
		
		ex9.go();
	}
}
