package nz.ac.ara.dos0311.Assignment.Part1;

public class Player {
	String direction;
//	to determine current coordinate for player
	int rowPosition;
	int colPosition;
	int countMovement;
//	Store those value for reset game.
	int startRow;
	int startCol;
	int[][] movementHistory;
//	Feature 6 where actually happen to create Eyeball
	public Player(int startingRow, int startingCol) {
//		default direction u for Up,
//		directions are l for Left, r for Right, d for Down
		this.direction = "u";
		Board.stageOneBoard();
		this.setPlayer(startingRow, startingCol);
		this.countMovement = 0;
		this.startRow = startingRow;
		this.startCol = startingCol;
		this.rowPosition = startingRow;
		this.colPosition = startingCol;
		
	}

	public void setPlayer(int row, int col) {
		this.rowPosition = row;
		this.colPosition = col;
	}

	public String currPosition() {
		String result = Board.map[this.rowPosition][this.colPosition];
		return result;
	}
	
//	Feature 4, reset current maze -> reset eyeball location and some values
//	as resetting current maze, maze will not be changed.
//	will be joint later in controller part
	public void resetPlayer(int row, int col) {
		this.setPlayer(this.startRow, this.startCol);
		this.direction = "u";
		this.countMovement = 0;
	}
	
//	Feature 9, movement count
	public void movementCount() {
		this.countMovement++;
	}
//	method for feature 19 & 20
	public String getCurrentDirection() {
		return this.direction;
	}
//	Feature 19, turning left
	public void turningLeft() {
		String currentDirection = this.getCurrentDirection();
		switch (currentDirection) {
		case "u":
			this.direction = "l";
			break;
		case "l":
			this.direction = "d";
			break;
		case "d":
			this.direction = "r";
			break;
		case "r":
			this.direction = "u";
			break;
		}
	}
//	Feature 20, turning right
	public void turningRight() {
		String currentDirection = this.getCurrentDirection();
		switch (currentDirection) {
		case "u":
			this.direction = "r";
			break;
		case "r":
			this.direction = "d";
			break;
		case "d":
			this.direction = "l";
			break;
		case "l":
			this.direction = "u";
			break;
		}
	}
	
//	Feature 13, destination block validator
	public Boolean checkDestinationBlock(int targetRow, int targetCol) {
		Boolean result = false;
//		to avoid magic number in condition statement
		int rowSpot = 0;
		int colSpot = 1;
		String[] destinationSpot = Board.map[targetRow][targetCol].split("\\|");
		String[] currentSpot = Board.map[this.rowPosition][this.colPosition].split("\\|");
		
		if (this.direction == "u") {
			result = facingUpMovement(targetRow, targetCol, destinationSpot, currentSpot, rowSpot, colSpot);
		} else if (this.direction == "l") {
			result = facingLeftMovement(targetRow, targetCol, destinationSpot, currentSpot, rowSpot, colSpot);
		} else if (this.direction == "d") {
			result = facingDownMovement(targetRow, targetCol, destinationSpot, currentSpot, rowSpot, colSpot);
		} else if (this.direction == "r") {
			result = facingRightMovement(targetRow, targetCol, destinationSpot, currentSpot, rowSpot, colSpot);
		} else {
			System.out.println("SOMETHING GONE WRONG CRAZY");
		}
		return result;
	}
//	Feature 10 ~ 12, depends on player's facing direction, do move forward, left, right
	public Boolean facingUpMovement(int targetRow, int targetCol, String[] destinationSpot, String[] currentSpot, int rowSpot, int colSpot) {
		Boolean result = false;
		if (this.rowPosition < targetRow) {
			System.out.println("You cannot go back");
			return result;
//			not on same column neither row, means diagonal direction which is not allowed
		} else if (this.colPosition != targetCol && this.rowPosition != targetRow) {
			System.out.println("You can only go straight lady !");
//			moving forward
		} else if (this.colPosition == targetCol && this.rowPosition > targetRow){
			result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//			moving either left or right here
		} else if (this.colPosition != targetCol && this.rowPosition == targetRow) {
//			right
			if (this.colPosition < targetCol) {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//				left
			} else {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
			}
		} else if (this.colPosition == targetCol && this.rowPosition == targetRow) {
			System.out.println("You cannot click where you are");
		} else {
			System.out.println("SOMETHING IS NOT RIGHT");
		}
		return result;
	}
	
	public Boolean facingLeftMovement(int targetRow, int targetCol, String[] destinationSpot, String[] currentSpot, int rowSpot, int colSpot) {
		Boolean result = false;
		if (this.colPosition < targetCol) {
			System.out.println("You cannot go back");
			return result;
//			not on same column neither row, means diagonal direction which is not allowed
		} else if (this.colPosition != targetCol && this.rowPosition != targetRow) {
			System.out.println("You can only go straight lady !");
//			moving forward
		} else if (this.colPosition > targetCol && this.rowPosition == targetRow){
			result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//			moving either left or right here
		} else if (this.colPosition == targetCol && this.rowPosition != targetRow) {
//			left
			if (this.rowPosition < targetRow) {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//				right
			} else {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
			}
		} else if (this.colPosition == targetCol && this.rowPosition == targetRow) {
			System.out.println("You cannot click where you are");
		} else {
			System.out.println("SOMETHING IS NOT RIGHT");
		}
		return result;
	}
	
	public Boolean facingDownMovement(int targetRow, int targetCol, String[] destinationSpot, String[] currentSpot, int rowSpot, int colSpot) {
		Boolean result = false;
		if (this.rowPosition > targetRow) {
			System.out.println("You cannot go back");
			return result;
//			not on same column neither row, means diagonal direction which is not allowed
		} else if (this.colPosition != targetCol && this.rowPosition != targetRow) {
			System.out.println("You can only go straight lady !");
//			moving forward
		} else if (this.colPosition == targetCol && this.rowPosition < targetRow){
			result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//			moving either left or right here
		} else if (this.colPosition != targetCol && this.rowPosition == targetRow) {
//			left
			if (this.colPosition < targetCol) {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//				right
			} else {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
			}
		} else if (this.colPosition == targetCol && this.rowPosition == targetRow) {
			System.out.println("You cannot click where you are");
		} else {
			System.out.println("SOMETHING IS NOT RIGHT");
		}
		return result;
	}
	
	public Boolean facingRightMovement(int targetRow, int targetCol, String[] destinationSpot, String[] currentSpot, int rowSpot, int colSpot) {
		Boolean result = false;
		if (this.colPosition > targetCol) {
			System.out.println("You cannot go back");
			return result;
//			not on same column neither row, means diagonal direction which is not allowed
		} else if (this.colPosition != targetCol && this.rowPosition != targetRow) {
			System.out.println("You can only go straight lady !");
//			moving forward
		} else if (this.colPosition < targetCol && this.rowPosition == targetRow){
			result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//			moving either left or right here
		} else if (this.colPosition == targetCol && this.rowPosition != targetRow) {
//			left
			if (this.rowPosition > targetRow) {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
//				right
			} else {
				result = decisionMaker(currentSpot, destinationSpot, rowSpot, colSpot);
			}
		} else if (this.colPosition == targetCol && this.rowPosition == targetRow) {
			System.out.println("You cannot click where you are");
		} else {
			System.out.println("SOMETHING IS NOT RIGHT");
		}
		return result;
	}
	
	public Boolean decisionMaker(String[] currentSpot, String[] destinationSpot, int rowSpot, int colSpot) {
		Boolean result = false;
		if (this.checkDestinationBlockSameColour(currentSpot[rowSpot], destinationSpot[rowSpot]) 
				|| this.checkDestinationBlockSameShape(currentSpot[colSpot], destinationSpot[colSpot])) {
			System.out.println("YES YOU CAN MOVE BECAUSE THEY ARE MATCHING");
			result = true;
		} else {
			System.out.println("YOU CAN'T GET THERE AS ITS NOT SAME COLOR NOR SHAPE");
		}
		return result;
	}
//	Feature 15, check whether destination block has same colour
	public Boolean checkDestinationBlockSameColour (String currColour, String destColour) {
		Boolean result = false;
		if (currColour.equals(destColour)) {
			result = true;
		}
		return result;
	}
//	Feature 16, check whether destination block has same shape
	public Boolean checkDestinationBlockSameShape (String currShape, String destShape) {
		Boolean result = false;
		if (currShape.equals(destShape)) {
			result = true;
		}
		return result;	
	}
}
