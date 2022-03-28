package roboRally;

public class Board {

    private int cols;
    private int rows;
    private String[][] board;



    public Board(int x, int y) {
	this.cols = x;
	this.rows = y;
	this.board = new String[cols][rows];
    }

    public void init() {
	for (int j = 0; j < cols; j++) {
	    for (int i = 0; i < rows; i++) {

		Double r = Math.random();

		if(r < 0.65) {
		    board[j][i] = "F";
		} else if(r < 0.7) {
		    board[j][i] = "P";
		} else if(r < 0.75) {
		    board[j][i] = "B";
		} else if(r < 0.8) {
		    board[j][i] = "L";
		} else if(r < 0.85) {
		    board[j][i] = "A";
		} else if(r < 0.9) {
		    board[j][i] = "H";
		} else if(r < 0.95) {
		    board[j][i] = "C";
		} else {
		    board[j][i] = "G";
		}
	    }
	}
	
	board[(int) Math.ceil(cols/2)][(int) Math.ceil(rows/2)] = "*";
    }
    
//    public void print() {
//	for (int j = 0; j < cols; j++) {
//	    for (int i = 0; i < rows; i++) {
//		System.out.print(board[j][i] + "  ");
//	    }
//	    System.out.println();
//	}
//    }

    public int getCols() {
	return cols;
    }



    public void setCols(int cols) {
	this.cols = cols;
    }



    public int getRows() {
	return rows;
    }



    public void setRows(int rows) {
	this.rows = rows;
    }

















}
