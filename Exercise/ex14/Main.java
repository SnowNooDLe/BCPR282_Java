package ex14;

public class Main {
	public static void main(String[] args) {
		VIew view = new ConsoleView();
		
		Controller ex14 = new Ex14Controller(view);
		
		ex14.go();
	}
}
