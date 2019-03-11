package syntax_test2;

public class Main {
	public static void main(String[] args) {
//		initialization of an object
		VIew view = new ConsoleView();
		Controller ec = new FibController(view);
		
		ec.go();
	}
}
