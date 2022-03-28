//package DraftUserStories;
//
//import java.awt.Robot;
//
//public class RobotCollision {
//	
//	private String tileFront = r.getTileFront();
//	Robot r = new Robot();
//	Player p = new Player();
//	
//	
//	@Given("two robots")
//	public void two_robots() {
//	    if(p.amount() == 1) {
//	    	r.error();
//	    }
//	}
//	@When("robot1 faces robot2")
//	public void robot1_faces_robot2() {
//		if(r.tileFront == "robot2" || "robot1") {
//			if(p.nextCard() == "move") {
//				r.move();
//				r.moveOther();
//			}
//		}
//	}
//}
