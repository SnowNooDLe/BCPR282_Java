package ex15;

public interface VIew {

	public String get(String prompt);

	public String get();

	public <T> void say(T message);

	public void start();

	public void stop();

}
