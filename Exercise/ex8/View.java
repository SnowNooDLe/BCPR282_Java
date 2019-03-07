package ex8;

public interface View {

	String get(String prompt);

	String get();

	<T> void say(T message);

	void start();

	void stop();

}
