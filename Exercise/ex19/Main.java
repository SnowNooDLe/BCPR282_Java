package ex19;

public class Main {
	public static void main(String[] args) {
		VIew theView = new ConsoleView();
		Controller ex19 = new Ex19Controller(theView);
		
		ex19.go();
	}
}
