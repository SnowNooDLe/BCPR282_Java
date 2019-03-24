package nz.ac.ara.dos0311.Ex20;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIew theView = new ConsoleView();
		Controller ex20 = new Ex20Ctonroller(theView);
		
		ex20.go();

	}

}
