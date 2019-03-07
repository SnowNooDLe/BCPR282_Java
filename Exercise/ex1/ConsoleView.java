package ex1;

import java.util.Scanner;

public class ConsoleView implements View{
	
	Scanner in = new Scanner(System.in);
	
	@Override
	public String get(String prompt) {
		this.say(prompt + ">");
		String input;
		System.out.println(">");
		input = in.nextLine();
		return input;
	}
	
	@Override
	public String get() {
		this.say(">");
		String input;
		input = in.nextLine();
		return input;
	}
	
	
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}
	
	@Override
	public void start() {
		System.out.println("Starting");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop");
	}
}
