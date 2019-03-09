package nzaccpitlancemclassy;

public class Farm {
	static Cat animal1;
	static Cat.Flea flea;
	
	public static void main(String[] args) {
		animal1 = new Cat("Brucey");
		flea = animal1.infest();
		
		System.out.println(animal1.hashCode());
		System.out.println(animal1.getName());
		animal1.speack();
		animal1.move();
		
		flea.move();
	}
}
