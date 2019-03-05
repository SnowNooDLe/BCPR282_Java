package whole_part_demo;

import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ToyBox 
{
	List<Toy> allMyToys = new ArrayList<Toy>();
	
	public void addToy(String name, Color color, BigDecimal cost)
	{
		Toy toy = new Toy(name, color, cost);
		allMyToys.add(toy);
	}
	
	public int getToyCount()
	{
		return this.allMyToys.size();
	}
	
	public String toString()
	{
		String result = "";
		for(Toy toy : this.allMyToys)
		{
			result += toy.toString() + "\n";
		}
		
		return result;
	}
	
	public Toy getToy(int index)
	{
		return this.allMyToys.get(index);
	}
}
