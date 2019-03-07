package ex3;

public class Main {
	public static void main(String[] args) {
		View view = new ConsoleView();
		
		ExerciseController ex3 = new Ex3ExerciseController(view);
		ex3.go();
		
	}
}
