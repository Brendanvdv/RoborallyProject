package DraftUserStories;

public class ObstacleCheck {

	Robot r = new Robot();
	Board b = new Board();
	Player p = new Player();
	
	private String tileOn = b.getTileUnder(r.getRobotx(), r.getRoboty());
	private String tileFront = b.getTileFront(r.getRobotx(), r.getRoboty(), r.getDirection());
	
	
	@Given //assigned tileUnder to local variable "tileOn" instead of repeating
	@When("the tile under is a gear")
	public void the_tile_under_is_a_gear() {
	    if(tileOn == "gear1") {
	    	r.rotate(1);
	    } else if(tileOn == "gear2") {
	    	r.rotate(3);
	    }
	}
	@Then //implemented within if else conditions for each obstacle
	
	@When("the tile under is acid")
	public void the_tile_under_is_acid() {
	    if(tileOn == "acid") {
	    	r.skipTurn();
	    }
	}
	
	@Given("the direction of the booster <boosterDirection>")
	public void the_direction_of_the_booster_booster_direction() {
	    if(tileOn == "booster") {
	    	int direction = b.tileInfo(robotx, roboty);
	    	r.moveBooster(1, direction);
	    }
	}

	@When("the tile under is a laser")
	public void the_tile_under_is_a_laser() {
	    if(tileOn == "laser") {
	    	r.damage(1);
	    }
	}
	
	@Given("the information about the tile in front <tileFront>")
	public void the_information_about_the_tile_in_front_tile_front() {
	    if(tileFront == "barrel") {
	    	if(p.nextCard() == "move") {
	    		p.skipCard();
	    	}
	    }
	}
}
