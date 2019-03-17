package ex17;

public class Main {
	public static void main(String[] args) {
		VIew myView = new ConsoleView();
		Controller ex17 = new Ex17Controller(myView);
		
		ex17.go();
	}
}
