package inheritance_example;

public class Main {
	private static Cat animal1;
	private static Cat.Flea flea;
	public static void main(String[] args) {
		animal1 = new Cat("Brucey");
		Animal animal2 = animal1.infest();
		
		System.out.println(animal2);
	}
}
