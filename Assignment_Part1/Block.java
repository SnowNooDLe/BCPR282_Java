package nz.ac.ara.dos0311.Assignment.Part1;

public class Block {
	String shape;
	String color;
//	Constructor for Block
	public Block(String newShape, String newColor) {
		this.shape = newShape;
		this.color = newColor;
	}
//	if attributes aren't given, default will be X which means it doesn't have any shape neither color hence can't go
	public Block() {
		this.shape = "X";
		this.color = "X";
	}
//	Feature 7, generate tile with certain shape
	public void setShape(String certainShape) {
		this.shape = certainShape;
	}
	
//	Feature 8, coloring that shape.
	public void colourShape(String certainColour) {
		this.color = certainColour;
	}
	
//	Feature 18, setting certain tile as a goal
	public void setGoal() {
		
	}
}
