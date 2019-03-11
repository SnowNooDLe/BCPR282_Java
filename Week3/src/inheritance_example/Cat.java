package inheritance_example;

public class Cat extends Animal {
	private static final String BYE = "BYE !";
//	child class
//	child class also must have a constructor
	public Cat(String name) {
		this.setName(name + "yyy");
	}
	
//	Override means giving implementation for child for parent's class regardless their implementation
	@Override
	public void speak() {
		System.out.println(this.getName() + " Meeeow Crikey!");
	}
	
	@Override
	public void move() {
		System.out.println("Cats are nerver seen to move");
	}
	
	public Flea infest() {
		return new Flea();
	}
	
	public class Flea extends Animal {
		@Override
		public void move() {
			System.out.println("Jump on Human");
			System.out.println(Cat.BYE);
		}
	}
}
