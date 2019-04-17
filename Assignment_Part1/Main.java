package nz.ac.ara.dos0311.Assignment.Part1;

public class Main {
	public static void main (String[] args) {
		Board board = new Board(6);
		board.stageOneBoard();
		board.print();
		System.out.println(board.map[5][2]);
		
		Player eyeball = new Player(5,2);
		System.out.println(eyeball.currPosition());
//		Block is Diamond Blue
//		System.out.println(eyeball.currposition());
//		Block is Diamond Red
		eyeball.checkDestinationBlock(4, 2);
//		Block is Flower Blue
		eyeball.checkDestinationBlock(3, 2);
		
	}
}
