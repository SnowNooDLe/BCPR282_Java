package ex4;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		ExerciseController ex4 = new Ex4ExerciseController(view);
		ex4.go();
	}
}
