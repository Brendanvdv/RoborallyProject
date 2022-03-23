package DraftUserStories;

public class Board {
	
	private String[][] b = new String[21][21];
	
	// making the board and checkpoint but not printing
	public void makeBoard() {
		for (int j = 0; j < b.length; j++) {
			for (int i = 0; i < b[0].length; i++) {
				Double r = Math.random();

				if(r < 0.65) {
					b[j][i] = "T";
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
		b[(int) Math.ceil(b.length/2)][(int) Math.ceil(b.length/2)] = "*";
		
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
	
	public String getTileUnder(int x, int y) {
		return b[y][x];
	}
	// checks for direction and prints tile in front
	public String getTileFront(int x, int y, int d) {
		if(d == 0) { // up
			return b[y-1][x];
		} else if(d == 1) { // right
			return b[y][x+1];
		} else if(d == 2) { // down
			return b[y+1][x];
		} else if(d == 3) { // left
			return b[y][x-1];
		} else {
			return "direction error";
		}
	}
	

}




