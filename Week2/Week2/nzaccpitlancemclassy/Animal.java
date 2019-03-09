package nzaccpitlancemclassy;

public abstract class Animal {
	private String name;
	
	public Animal() {
		this.name = "Bruce";
	}
	
	public void Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void speack() {
		System.out.println("Crickey !");
	}
	
	abstract void move();
}
