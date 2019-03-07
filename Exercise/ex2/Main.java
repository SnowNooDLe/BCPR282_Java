package ex2;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		ExerciseController ex2 = new Ex2ExerciseController(view);
		ex2.go();
	}
}
