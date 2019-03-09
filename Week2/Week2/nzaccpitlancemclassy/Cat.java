package nzaccpitlancemclassy;

public class Cat extends Animal{
	
	public Cat(String name) {
		setName(name + "yyy");
	}
	
	@Override
	public void speack() {
		System.out.println(getName() + "Meeeow Cirkey !");
	}
	
	public void move() {
		System.out.println("cats are never seen to move");
	}
	
	public Flea infest() {
		return new Flea();
	}
	
	public class Flea extends Animal{
		public void move() {
			System.out.println("jump on Human");
		}
	}
}
