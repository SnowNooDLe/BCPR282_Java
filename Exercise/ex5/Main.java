package ex5;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex5 = new Ex5Controller (view);
		ex5.go();
	}
}
