package ex19;

import java.util.Scanner;

public class ConsoleView implements VIew{
	Scanner in = new Scanner(System.in);
	
	@Override
	public int get(String prompt) {
		int input;
		this.say(prompt);
		input = Integer.parseInt(in.nextLine());
		
		return input;
	}
	
	@Override
	public int get() {
		int input;
		System.out.println(">");
		input = Integer.parseInt(in.nextLine());
		
		return input;
	}
	
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}
}
