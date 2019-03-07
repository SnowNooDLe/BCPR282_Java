package ex1;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		ExerciseController ex1 = new Ex1Controller(view);
		ex1.go();
	}
}
