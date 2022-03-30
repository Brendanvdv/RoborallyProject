package amirrobot;

public class Board {

    private String[][] b;

    public Board(int x, int y) {
	b = new String[x][y];
    }
    // making the board and checkpoint but not printing
    public void makeBoard() {
	for (int j = 0; j < b.length; j++) {
	    for (int i = 0; i < b[0].length; i++) {
		Double r = Math.random();
		if(r < 0.65) {
		    b[j][i] = "F";
		} else if(r < 0.7) {
		    b[j][i] = "P";
		} else if(r < 0.75) {
		    b[j][i] = "B";
		} else if(r < 0.8) {
		    b[j][i] = "L";
		} else if(r < 0.85) {
		    b[j][i] = "A";
		} else if(r < 0.9) {
		    b[j][i] = "H";
		} else if(r < 0.95) {
		    b[j][i] = "C";
		} else {
		    b[j][i] = "G";
		}
	    }
	}

	// checkpoint 
	b[(int) Math.ceil(b.length/2)][(int) Math.ceil(b[0].length/2)] = "*";

    }
    // printing the board
    public void printBoard() {
	for (int j = 0; j < b.length; j++) {
	    for (int i = 0; i < b[0].length; i++) {
		System.out.print(b[j][i] + "  ");
	    }
	    System.out.println();
	}
    }
    // Pulling a value from the board
    public String pull(int x, int y) {
	return b[y][x];
    }
    
    public int height() {
	return b[0].length;
    }
    
    public int width() {
	return b.length;
    }

}



