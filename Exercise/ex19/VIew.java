package ex19;

public interface VIew {

	public int get();

	public int get(String prompt);

	public <T> void say(T message);

}
