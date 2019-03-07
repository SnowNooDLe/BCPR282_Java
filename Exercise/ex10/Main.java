package ex10;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex10 = new Ex10Controller(view);
		ex10.go();
	}
}
