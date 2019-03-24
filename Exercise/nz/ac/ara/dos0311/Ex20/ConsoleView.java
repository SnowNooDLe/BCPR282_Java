package nz.ac.ara.dos0311.Ex20;

import java.util.Scanner;

public class ConsoleView implements VIew {
	Scanner in = new Scanner(System.in);
	
	@Override
	public String get(String prompt) {
		this.say(prompt);
		String input;
		input = in.nextLine();
		
		return input;
	}
	
	@Override
	public String get() {
		System.out.println(">");
		String input;
		input = in.nextLine();
		
		return input;
	}
	
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}
	
}
