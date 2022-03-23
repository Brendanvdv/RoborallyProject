package DraftUserStories;

public class Robot {
	
	private int direction;
	private int lives;
	private int robotx;
	private int roboty;
	
	public void rotate(int r) {
		setDirection((getDirection() - r)%4); // left is 1, right is 3
	}
	
	public void move(int s, int d) {
		if(d == 0) { // up
			this.setRoboty(this.roboty + s);
		} else if(d == 1) { // right
			this.setRobotx(this.robotx + s);
		} else if(d == 2) { // down
			this.setRoboty(this.roboty - s);
		} else if(d == 3) { // left
			this.setRobotx(this.robotx - s);
		} else {
			System.out.println("direction error for movement");
		}
	}
	
	
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
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
	
	
	
	
}
