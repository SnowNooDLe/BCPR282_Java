package nz.ac.ara.dos0311.Assignment.Part1;

public class Board {
    public int size;
    public static String[][] map;
    public int mazeLevel;
//    Constructor
//    No algorithm, so need to hard code
//    Feature 5, generate Maze
    public Board (int size) {
        this.size = size;
        this.map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.map[row][col] = "X|X";
            }
        }
        this.mazeLevel = 1;
    }
//    constructor for default map size by 6x6
    public Board() {
    	this.size = 6;
    	this.map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.map[row][col] = "X|X";
            }
        }
        this.mazeLevel = 1;
    }
    
//    Feature 5-1. Creating Maze
    public static void stageOneBoard() {
//    	first row
    	map[0][3] = "F|R";
//    	second row
    	map[1][1] = "C|B";
    	map[1][2] = "F|Y";
    	map[1][3] = "D|Y";
    	map[1][4] = "C|G";
//    	Third row
    	map[2][1] = "F|G";
    	map[2][2] = "S|R";
    	map[2][3] = "S|G";
    	map[2][4] = "D|Y";
//    	Fourth row
    	map[3][1] = "F|R";
    	map[3][2] = "F|B";
    	map[3][3] = "S|R";
    	map[3][4] = "F|G";
//    	Fifth row
    	map[4][1] = "S|B";
    	map[4][2] = "D|R";
    	map[4][3] = "F|B";
    	map[4][4] = "D|B";
//    	Sixth row
    	map[5][2] = "D|B";
    }
    
//  Feature 5-2. Creating Maze
    public static void stageTwoBoard() {
//  	first row
  		map[0][3] = "F|R";
//  	second row
	  	map[1][1] = "C|B";
	  	map[1][2] = "F|B";
	  	map[1][3] = "D|B";
	  	map[1][4] = "C|G";
//  	Third row
	  	map[2][1] = "F|G";
	  	map[2][2] = "S|R";
	  	map[2][3] = "S|G";
	  	map[2][4] = "F|Y";
//  	Fourth row
	  	map[3][1] = "F|R";
	  	map[3][2] = "D|G";
	  	map[3][3] = "S|R";
	  	map[3][4] = "S|Y";
//  	Fifth row
	  	map[4][1] = "C|G";
	  	map[4][2] = "D|R";
	  	map[4][3] = "F|B";
	  	map[4][4] = "D|G";
//  	Sixth row
	  	map[5][2] = "D|B";
    }

    //	Feature 3. Choose maze level attribute will come from user click later on.
	public void chooseMazeLevel(int level) {
		this.mazeLevel = level;
	}
    
//    need to delete this later
    public void print() {
        for (int row = 0; row < size; row++) {
            // ".", "O", "X"
            for (int col = 0; col < size; col++) {
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }

    }
    
    
}
