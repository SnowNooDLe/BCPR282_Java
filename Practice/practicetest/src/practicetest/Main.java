package practicetest;

public class Main {
	public static void main(String[] args)
	{
		View view = new ConsoleView();
		
		Controller ex3 = new Ex3Controller(view);
		ex3.go();
	}
}
