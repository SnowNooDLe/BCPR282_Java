package ex16;

public class Main {
	public static void main(String[] args) {
		VIew view = new ConsoleView();
		Controller ex16 = new Ex16Controller(view);
		
		ex16.go();
		
	}
}
