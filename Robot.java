package amirrobot;

public class Robot {
	
    private int dir;
    private int lives;
    private int rCol;
    private int rRow;

    // Spawning on a random corner
    Robot(Board b) {

	double val = Math.random();

	if(val < 0.25) {
	    setrCol(0);setrRow(0);
	    setDir(2);
	} else if(val < 0.5) {
	    setrCol(0);setrRow(b.width() - 1);
	    setDir(3);
	} else if(val < 0.75) {
	    setrCol(b.height() - 1);setrRow(0);
	    setDir(1);
	} else {
	    setrCol(b.height() - 1);setrRow(b.width() - 1);
	    setDir(0);
	}
    }
    // Rotating along a coordinate
    public void rotate(int r) {
    	if(r == 1) {
    		System.out.println("Robot rotated to the left");
    	} else if(r == 3) {
    		System.out.println("Robot rotated to the right");
    	} else if(r == 2) {
    		System.out.println("Robot made a U-turn");
    	}
//    	System.out.println(getDir());
    	setDir((getDir() + r)%4); // left is 1, right is 3
//    	System.out.println(getDir());
    }
    // Checking if the move is valid, if then move
    public void valid_move(Board b, int s) {
//    	System.out.println("robot moved by " + s);
    	if(getDir() == 0) { //left
    		if(getrCol() - s >= 0) {
    			setrCol(getrCol() - s);
    			System.out.println("moved left " + s);
    		}
    	} else if(getDir() == 1) { //down
    		if(getrRow() + s < b.height()) {
    			setrRow(getrRow() + s);
    			System.out.println("moved down " + s);

    		}
    	} else if(getDir() == 2) { //right
    		if(getrCol() + s < b.width()) {
    			setrCol(getrCol() + s);
    			System.out.println("moved right " + s);

    		}
    	} else if(getDir() == 3) { //up
    		if(getrRow() - s >= 0) {
    			setrRow(getrRow() - s);
    			System.out.println("moved up " + s);

    		}
    	} else {
    		System.out.println("invalid move");
    	}
    }

    public String getTileUnder(Board b) {
    	return b.pull(rCol, rRow);
    }

    public String getTileFront(Board b) {
    	if(dir == 0) { //left
    		return b.pull(rCol - 1,rRow);
    	} else if(dir == 1) { //down
    		return b.pull(rCol,rRow + 1);
    	} else if(dir == 2) { //right
    		return b.pull(rCol + 1,rRow);
    	} else if(dir == 3) { //up
    		return b.pull(rCol,rRow - 1);
    	} else {
    		return "dir error";
    	}
    }
    
//    public void damage(int i) {
//    	setLives(lives - i);
//    	if(lives<=0) {
//    		//kill robot
//    		g.kill(this);
//    	}
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getDir() {
    	return dir;
    }
    public void setDir(int dir) {
    	this.dir = dir;
    }
    public int getrCol() {
    	return rCol;
    }
    public void setrCol(int rCol) {
    	this.rCol = rCol;
    }
    public int getrRow() {
    	return rRow;
    }
    public void setrRow(int rRow) {
    	this.rRow = rRow;
    }
    public int getLives() {
    	return lives;
    }
    public void setLives(int lives) {
    	this.lives = lives;
    }
}