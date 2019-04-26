package nz.ac.ara.dos0311.Assignment.Part1;

public class Main {
	public static void main (String[] args) {
		Board board = new Board(6);
		board.print();
		board.stageOneBoard();
		
    	board.setGoal(0,3);
    	board.setGoal(1, 1);
    	
    	for (int i = 0; i < board.numberOfGoals; i++) {
    		System.out.println("Goals : " + board.goal[i]);
    	}
    	
		System.out.println("The goal is : " + board.goal);
		Player eyeball = new Player(5,2, board);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(3, 2);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(3, 4);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(1, 4);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(1, 1);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(4, 1);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(4, 3);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrentDirection());
		eyeball.moveEyeball(0, 3);
		
		System.out.println(eyeball.getCurrPosition());
		System.out.println(eyeball.getCurrCoordinates());
		System.out.println(board.goal[0]);
		System.out.println(eyeball.getCurrCoordinates().equals(board.goal[0]));
		System.out.println(board.calculateTimer());
//		
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
		
//		while (!eyeball.playerFailed()) {
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
//			eyeball.moveEyeball(3, 2);
//			
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
//			eyeball.moveEyeball(3, 4);
//			
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
//			eyeball.moveEyeball(1, 4);
//			
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
//			eyeball.moveEyeball(1, 1);
//			
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
//			eyeball.moveEyeball(4, 1);
//			
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
//			eyeball.moveEyeball(4, 3);
//			
//			System.out.println(eyeball.getCurrPosition());
//			System.out.println(eyeball.getCurrentDirection());
////			eyeball.moveEyeball(0, 3);
////			
////			System.out.println(eyeball.getCurrPosition());
////			System.out.println(eyeball.getCurrentDirection());
//			eyeball.countMovement++;
//			System.out.println(eyeball.getCurrentMoveCount());
//			board.calculateTimer();
//		}
		
//		System.out.println("YOU DUMB DUMB");
		
		
		
//		System.out.println("At movement 0 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println(eyeball.getCurrPosition());
////		moving up
//		eyeball.moveEyeball(4, 2);
//		System.out.println("At movement 1 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
////		moving right
//		eyeball.moveEyeball(4, 4);
//		System.out.println("At movement 2 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
////		moving left
//		eyeball.moveEyeball(2, 4);
//		System.out.println("At movement 3 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
//		System.out.println("number of movement: " + eyeball.getCurrentMoveCount());
////		going back one movement
//		System.out.println("LETS MOVE BACK ONCE");
//		eyeball.goBackOneMove();
//		System.out.println("At movement 2 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println("number of movement: " +eyeball.getCurrentMoveCount());
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.rowPosition);
//		System.out.println(eyeball.colPosition);
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
//	
////		going back one movement
//		System.out.println("LETS MOVE BACK ONCE");
//		eyeball.goBackOneMove();
//		System.out.println("At movement 1 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println("number of movement: " +eyeball.getCurrentMoveCount());
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.rowPosition);
//		System.out.println(eyeball.colPosition);
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
//		
////		moving up
//		eyeball.moveEyeball(2, 2);
//		System.out.println("At movement 2 am @: " + eyeball.movementHistory[eyeball.countMovement]);
//		System.out.println(eyeball.getCurrPosition());
//		System.out.println(eyeball.getCurrentDirection());
	}
}
