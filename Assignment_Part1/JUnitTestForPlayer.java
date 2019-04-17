package nz.ac.ara.dos0311.Assignment.Part1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTestForPlayer {
//	This is static because they only run once.
	static void setup() {
		System.out.println("@BeforeAll - Execute once before all test methods in this class");
	}
	
	@BeforeEach
	void init() {
		System.out.println("@BeforeEach - Executed before each test method in this class");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach - Executed after each test method in this class");
	}
	
	@AfterAll
	static void done() {
		System.out.println("@AfterAll - Execute once after all test methods in this class");
	}

	@Test
	void test01() throws Exception{
		try {
			System.out.println("---------- TEST1 Whether we spawn player on right spot, on Diamond Blue --------------");

//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			final String EXPECTED = "D|B";
			final String ERROR_MSG = "It should be at Diamond Blue, Row : 5 and Col : 2";
			
//			Act
//			print the label of it's position which should be DB (Diamond Blue)
			final String ACTUAL = eyeball.currPosition();	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test02() throws Exception{
		try {
			System.out.println("---------- TEST2 Whether we moved player from DB to DR --------------");

//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
//			change to location of eyeball to row4, col2
			eyeball.setPlayer(4, 2);
			final String EXPECTED = "D|R";
			final String ERROR_MSG = "It should be at Diamond Red, Row : 4 and Col : 2";
			
//			Act
//			print the label of it's position which should be DR (Diamond Red)
			final String ACTUAL = eyeball.currPosition();	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
//	Facing UP
	@Test
	void test03() throws Exception{
		try {
			System.out.println("---------- TEST3 Whether destination block is eligible to go ----------");
			System.out.println("---------- Firstly, test one behind the character ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(4,2);
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You cannot go backward at any time";
			
//			Act
//			Block at row6, col2 is actually behind character, so cannot go.
			final Boolean ACTUAL = eyeball.checkDestinationBlock(5, 2);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test04() throws Exception{
		try {
			System.out.println("---------- TEST4 Whether destination block is eligible to go --------------");
			System.out.println("---------- Secondly, test one thats not on characters way ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go straight";
			
//			Act
//			Block at row5, col3 is not on the way that character is facing
			final Boolean ACTUAL = eyeball.checkDestinationBlock(5, 3);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test05() throws Exception{
		try {
			System.out.println("---------- TEST5 Whether destination block is eligible to go --------------");
			System.out.println("---------- Thirdly, test one thats on characters way and same color ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col2 is Flower Blue which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 2);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test06() throws Exception{
		try {
			System.out.println("---------- TEST6 Whether destination block is eligible to go --------------");
			System.out.println("---------- Fourthly, test one thats on characters way and same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col2 is Diamond Red which is same shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 2);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test07() throws Exception{
		try {
			System.out.println("---------- TEST7 Whether destination block is eligible to go --------------");
			System.out.println("---------- Fifthly, test one thats on characters way but neither same color nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row2, col2 is Star Red which is neither same color nor shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(2, 2);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test08() throws Exception{
		try {
			System.out.println("---------- TEST8 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col1 is Flower Red which is same sahpe
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test09() throws Exception{
		try {
			System.out.println("---------- TEST9 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col4 is Flower Green which is shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test10() throws Exception{
		try {
			System.out.println("---------- TEST10 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DY (Diamond Yellow)
			Player eyeball = new Player(1,3);
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col2 is Flower Yellow which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 2);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test11() throws Exception{
		try {
			System.out.println("---------- TEST11 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, SB (Star Blue)
			Player eyeball = new Player(4,1);
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col4 is Diamond Blue which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test12() throws Exception{
		try {
			System.out.println("---------- TEST12 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DY (Diamond Yellow)
			Player eyeball = new Player(1,3);
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col1 is Cross Blue which neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test13() throws Exception{
		try {
			System.out.println("---------- TEST13 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, SB (Star Blue)
			Player eyeball = new Player(4,1);
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col2 is Diamond Red which is neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 2);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
//	Facing Left
	@Test
	void test14() throws Exception{
		try {
			System.out.println("---------- TEST14 Whether destination block is eligible to go ----------");
			System.out.println("---------- Firstly, test one behind the character ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(4,2);
			eyeball.direction = "l";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You cannot go backward at any time";
			
//			Act
//			Block at row4, col3 is actually behind character, so cannot go.
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 3);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test15() throws Exception{
		try {
			System.out.println("---------- TEST15 Whether destination block is eligible to go --------------");
			System.out.println("---------- Secondly, test one thats not on characters way ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			eyeball.direction = "l";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go straight";
			
//			Act
//			Block at row4, col1 is at diagonal
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 1);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test16() throws Exception{
		try {
			System.out.println("---------- TEST16 Whether destination block is eligible to go --------------");
			System.out.println("---------- Thirdly, test one thats on characters way and same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "l";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col1 is Flower Red which is same shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 1);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test17() throws Exception{
		try {
			System.out.println("---------- TEST17 Whether destination block is eligible to go --------------");
			System.out.println("---------- Fifthly, test one thats on characters way but neither same color nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DR (Diamond Red)
			Player eyeball = new Player(4,2);
			eyeball.direction = "l";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col1 is Star Blue which is neither same color nor shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test18() throws Exception{
		try {
			System.out.println("---------- TEST18 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DR (Diamond Red)
			Player eyeball = new Player(4,2);
			eyeball.direction = "l";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row5, col2 is Diamond Blue which is same sahpe
			final Boolean ACTUAL = eyeball.checkDestinationBlock(5, 2);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test19() throws Exception{
		try {
			System.out.println("---------- TEST19 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "l";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col2 is Flower Yellow which is shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 2);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test20() throws Exception{
		try {
			System.out.println("---------- TEST20 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, CG (Cross Green)
			Player eyeball = new Player(1,4);
			eyeball.direction = "l";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col4 is Flower Green which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test21() throws Exception{
		try {
			System.out.println("---------- TEST21 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, SB (Star Blue)
			Player eyeball = new Player(4,1);
			eyeball.direction = "l";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col1 is Cross Blue which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test22() throws Exception{
		try {
			System.out.println("---------- TEST22 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DY (Diamond Yellow)
			Player eyeball = new Player(1,3);
			eyeball.direction = "l";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row2, col3 is Star Green which neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(2, 3);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test23() throws Exception{
		try {
			System.out.println("---------- TEST13 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, SB (Star Blue)
			Player eyeball = new Player(4,1);
			eyeball.direction = "l";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col1 is Flower Red which is neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
//	Facing Down
	@Test
	void test24() throws Exception{
		try {
			System.out.println("---------- TEST24 Whether destination block is eligible to go ----------");
			System.out.println("---------- Firstly, test one behind the character ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(5,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You cannot go backward at any time";
			
//			Act
//			Block at row3, col2 is actually behind character, so cannot go.
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 2);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test25() throws Exception{
		try {
			System.out.println("---------- TEST25 Whether destination block is eligible to go --------------");
			System.out.println("---------- Secondly, test one thats not on characters way ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go straight";
			
//			Act
//			Block at row4, col1 is at diagonal
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 1);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test26() throws Exception{
		try {
			System.out.println("---------- TEST26 Whether destination block is eligible to go --------------");
			System.out.println("---------- Thirdly, test one thats on characters way and same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row5, col2 is Diamond Blue which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(5, 2);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test27() throws Exception{
		try {
			System.out.println("---------- TEST27 Whether destination block is eligible to go --------------");
			System.out.println("---------- Fifthly, test one thats on characters way but neither same color nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DR (Diamond Red)
			Player eyeball = new Player(4,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col1 is Star Blue which is neither same color nor shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test28() throws Exception{
		try {
			System.out.println("---------- TEST28 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DR (Diamond Red)
			Player eyeball = new Player(4,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col4 is Diamond Blue which is same sahpe
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test29() throws Exception{
		try {
			System.out.println("---------- TEST29 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col1 is Flower Red which is shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test30() throws Exception{
		try {
			System.out.println("---------- TEST30 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FY (Flower Yellow)
			Player eyeball = new Player(1,2);
			eyeball.direction = "d";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col3 is Diamond Yellow which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 3);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test31() throws Exception{
		try {
			System.out.println("---------- TEST31 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, SG (Star Green)
			Player eyeball = new Player(2,3);
			eyeball.direction = "d";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row2, col1 is Flower Green which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(2, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test32() throws Exception{
		try {
			System.out.println("---------- TEST32 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DY (Diamond Yellow)
			Player eyeball = new Player(1,3);
			eyeball.direction = "d";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col4 is Star Green which neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test33() throws Exception{
		try {
			System.out.println("---------- TEST33 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, CG (Cross Green)
			Player eyeball = new Player(1,4);
			eyeball.direction = "d";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col3 is Diamond Yellow which is neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 3);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
//	Facing Right
	@Test
	void test34() throws Exception{
		try {
			System.out.println("---------- TEST34 Whether destination block is eligible to go ----------");
			System.out.println("---------- Firstly, test one behind the character ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DR (Diamond Red)
			Player eyeball = new Player(4,2);
			eyeball.direction = "r";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You cannot go backward at any time";
			
//			Act
//			Block at row4, col1 is actually behind character, so cannot go.
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 1);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test35() throws Exception{
		try {
			System.out.println("---------- TEST35 Whether destination block is eligible to go --------------");
			System.out.println("---------- Secondly, test one thats not on characters way ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "r";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go straight";
			
//			Act
//			Block at row4, col3 is at diagonal
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 3);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test36() throws Exception{
		try {
			System.out.println("---------- TEST36 Whether destination block is eligible to go --------------");
			System.out.println("---------- Thirdly, test one thats on characters way and same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FB (Flower Blue)
			Player eyeball = new Player(3,2);
			eyeball.direction = "r";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col4 is Flower Green which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 4);	
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test37() throws Exception{
		try {
			System.out.println("---------- TEST37 Whether destination block is eligible to go --------------");
			System.out.println("---------- Fifthly, test one thats on characters way but neither same color nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DR (Diamond Red)
			Player eyeball = new Player(4,2);
			eyeball.direction = "r";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col3 is Flower Blue which is neither same color nor shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 3);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test38() throws Exception{
		try {
			System.out.println("---------- TEST38 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DB (Diamond Blue)
			Player eyeball = new Player(4,4);
			eyeball.direction = "r";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same shape";
			
//			Act
//			Block at row2, col4 is Diamond Yellow which is same sahpe
			final Boolean ACTUAL = eyeball.checkDestinationBlock(2, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test39() throws Exception{
		try {
			System.out.println("---------- TEST39 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, SG (Star Green)
			Player eyeball = new Player(2,3);
			eyeball.direction = "r";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row3, col3 is Star Red which is shape
			final Boolean ACTUAL = eyeball.checkDestinationBlock(3, 3);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test40() throws Exception{
		try {
			System.out.println("---------- TEST40 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, FG (Flower Green)
			Player eyeball = new Player(3,4);
			eyeball.direction = "r";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col4 is Cross Green which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test41() throws Exception{
		try {
			System.out.println("---------- TEST41 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right with same colour ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, CB (Cross Blue)
			Player eyeball = new Player(1,1);
			eyeball.direction = "r";
			final Boolean EXPECTED = true;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row4, col1 is Star Blue which is same colour
			final Boolean ACTUAL = eyeball.checkDestinationBlock(4, 1);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test42() throws Exception{
		try {
			System.out.println("---------- TEST42 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for left neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DY (Diamond Yellow)
			Player eyeball = new Player(1,3);
			eyeball.direction = "r";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row2, col3 is Star Green which neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(2, 3);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}
	
	@Test
	void test43() throws Exception{
		try {
			System.out.println("---------- TEST33 Whether destination block is eligible to go --------------");
			System.out.println("---------- Checking for right neither colour nor shape ----------");
//			Arrange
			Board board = new Board(6);
			board.stageOneBoard();
//			initialize eyeball at starting point first, DY (Diamond Yellow)
			Player eyeball = new Player(2,4);
			eyeball.direction = "r";
			final Boolean EXPECTED = false;
			final String ERROR_MSG = "You can only go to same color or same shape";
			
//			Act
//			Block at row1, col4 is Cross Green which is neither
			final Boolean ACTUAL = eyeball.checkDestinationBlock(1, 4);		
			
//			Assert
			assertEquals(EXPECTED, ACTUAL, ERROR_MSG);
		   }
		   catch (IllegalArgumentException e) {
		     System.out.println(e.getMessage());
		   }
	}

}

