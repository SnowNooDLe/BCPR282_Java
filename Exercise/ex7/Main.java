package ex7;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex7 = new Ex7Controller(view);
		ex7.go();
	}
}
