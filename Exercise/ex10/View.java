package ex10;

public interface View {

	void stop();

	void start();

	<T> void say(T message);

	String get();

	String get(String prompt);

}
