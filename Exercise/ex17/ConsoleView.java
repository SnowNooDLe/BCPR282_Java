package ex17;

import java.util.Scanner;

public class ConsoleView implements VIew{
	Scanner in = new Scanner (System.in);
	
	@Override
	public String get(String prompt) {
		String input;
		this.say(prompt);
		input = in.nextLine();
		
		return input;
	}
	
	@Override
	public String get() {
		String input;
		System.out.println(">");
		input = in.nextLine();
		
		return input;
	}
	
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}

}
