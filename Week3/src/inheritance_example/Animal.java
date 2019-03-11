package inheritance_example;

public abstract class Animal {
//	parent class
//	Variable declaration, access modifier is private, data type string, variable name name.
	private String name;
	
//	It's a constructor, and must be public
	public Animal() {
//		this.name = "Bruce";
		this.setName("Bruce");
	}
	
	public Animal(String name) {
//		this.name = name;
		this.setName(name);
	}
	
//	set method
	public void setName(String name) {
		this.name = name;
	}
	
//	get method
	public String getName() {
		return this.name;
	}
	
	public void speak() {
		System.out.println("Crikey !");
	}
	
//	child class will implement for this method
	abstract void move();
	
}
