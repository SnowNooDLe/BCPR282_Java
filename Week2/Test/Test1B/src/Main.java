
public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		Controller ex1 = new Ex1Controller(view);
		
		ex1.go();
	}
}
