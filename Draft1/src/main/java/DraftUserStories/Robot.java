package DraftUserStories;

public class Robot {
	
    private int dir;
    private int lives;
    private int robotx;
    private int roboty;

    public int getDir() {
    	return dir;
    }
    public void setDir(int dir) {
    	this.dir = dir;
    }
    public int getRobotx() {
    	return robotx;
    }
    public void setRobotx(int robotx) {
    	this.robotx = robotx;
    }
    public int getRoboty() {
    	return roboty;
    }
    public void setRoboty(int roboty) {
    	this.roboty = roboty;
    }
    public int getLives() {
    	return lives;
    }
    public void setLives(int lives) {
    	this.lives = lives;
    }
    // Spawning on a random corner
    Robot(Board b) {

	double val = Math.random();

	if(val < 0.25) {
	    setRobotx(0);setRoboty(0);
	    setDir(2);
	} else if(val < 0.5) {
	    setRobotx(0);setRoboty(b.width() - 1);
	    setDir(3);
	} else if(val < 0.75) {
	    setRobotx(b.height() - 1);setRoboty(0);
	    setDir(1);
	} else {
	    setRobotx(b.height() - 1);setRoboty(b.width() - 1);
	    setDir(0);
	}
    }
    // Rotating along a coordinate
    public void rotate(int r) {
    	if(r == 1) {
    		System.out.println("Robot rotated to the right");
    	} else if(r == 3) {
    		System.out.println("Robot rotated to the left");
    	} else if(r == 2) {
    		System.out.println("Robot made a U-turn");
    	}
    	setDir((getDir() - r)%4); // left is 1, right is 3

    }
    // Checking if the move is valid, if then move
    public void valid_move(Board b, int s) {
    	if(getDir() == 0) { //left
    		if(getRobotx() - s < 0) {
    			setRobotx(getRobotx() - s);
    		}
    	} else if(getDir() == 1) { //down
    		if(getRoboty() + s < b.height()) {
    			setRoboty(getRoboty() + s);
    		}
    	} else if(getDir() == 2) { //right
    		if(getRobotx() + s < b.width()) {
    			setRobotx(getRobotx() + s);
    		}
    	} else if(getDir() == 3) { //up
    		if(getRoboty() - s < 0) {
    			setRoboty(getRoboty() - s);
    		}
    	} else {
    		System.out.println("invalid move");
    	}
    }

    public String getTileUnder(Board b) {
    	return b.pull(robotx, roboty);
    }

    public String getTileFront(Board b) {
    	if(dir == 0) { //left
    		return b.pull(robotx - 1,roboty);
    	} else if(dir == 1) { //down
    		return b.pull(robotx,roboty + 1);
    	} else if(dir == 2) { //right
    		return b.pull(robotx + 1,roboty);
    	} else if(dir == 3) { //up
    		return b.pull(robotx,roboty - 1);
    	} else {
    		return "dir error";
    	}
    }
    
    public void damage(int i) {
    	setLives(lives - i);
    	if(lives<=0) {
    		//kill robot
    		g.kill(this);
    	}
    }
}
