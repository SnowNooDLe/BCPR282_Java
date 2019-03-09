package ex12;

public interface VIew {

	String get(String prompt);

	String get();

	<T> void say(T message);

	void start();
	
	void stop();

}
