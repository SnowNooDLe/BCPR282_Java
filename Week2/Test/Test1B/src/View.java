
public interface View {

	public String get(String prompt);

	public String get();

	public void start();

	public <T> void say(T message);

	public void stop();

}
