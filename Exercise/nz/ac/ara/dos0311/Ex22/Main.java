package nz.ac.ara.dos0311.Ex22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIew theView = new ConsoleView();
		
		Controller ex22 = new Ex22Controller(theView);
		
		ex22.go();

	}

}
