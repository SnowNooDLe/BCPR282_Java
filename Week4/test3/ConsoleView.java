package test3;

import java.util.Scanner;

public class ConsoleView implements VIew{
	Scanner in = new Scanner(System.in);
	
	@Override
	public <T> void say(T message) {
		System.out.println(message);
	}
	
	@Override
	public <T> void add(T message) {
		System.out.print(message);
	}

}
