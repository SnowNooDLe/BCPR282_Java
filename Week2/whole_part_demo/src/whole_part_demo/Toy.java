package whole_part_demo;

import java.awt.Color;
import java.math.BigDecimal;

public class Toy 
{
	String name;
	Color color;
//	better than double and float in terms of accuracy
	BigDecimal cost;
	
	
//	Constructor
	public Toy(String name, Color color, BigDecimal cost)
	{
//		this.name = name;
//		this.color = color;
//		this.cost = cost;
		this.set(name,  color,  cost);
	}
	
	
//	Constructor with different input parameter with default WHITE for color, $0 for cost
	public Toy(String name)
	{
//		this.name = name;
//		this.color = Color.WHITE;
//		this.cost = new BigDecimal("0.0");
		this.set(name, Color.WHITE, new BigDecimal("0.0"));
	}
	
	
	public void set(String name, Color color, BigDecimal cost)
	{
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	
	public String get()
	{
		return this.name + "\t ( " + this.color.toString() + " )\t @ $ " + this.cost.toPlainString();
	}
	
}
