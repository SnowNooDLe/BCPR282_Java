package whole_part_demo;

import java.awt.Color;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args)
	{
		ToyBox toybox = new ToyBox();
		
		toybox.addToy("Teddy", Color.DARK_GRAY, new BigDecimal("11.99"));
		toybox.addToy("Pencil", Color.RED, new BigDecimal("5.50"));
		toybox.addToy("teddy", Color.GREEN, new BigDecimal("111.99"));
		toybox.addToy("Pencil", Color.BLACK, new BigDecimal(".30"));
	
		for (int i = 0; i < toybox.getToyCount(); i++) 
		{
			System.out.println(toybox.getToy(i).get());
		}
		
		for (Toy t : toybox.allMyToys)
		{
			System.out.println(t);
		}
	}
}
