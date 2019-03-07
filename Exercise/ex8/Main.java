package ex8;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex8 = new Ex8Controller(view);
		
		ex8.go();
	}
}
