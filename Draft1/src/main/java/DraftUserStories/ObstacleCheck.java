package DraftUserStories;

public class ObstacleCheck {

	Robot r = new Robot();
	Board b = new Board();
	Player p = new Player();
	Game g = new Game();
	
	private String tileOn = r.getTileUnder(b);
	private String tileFront = r.getTileFront(b);
	
	
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
	    	g.skipTurn();
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
	
	@When("the tile under is a pit")
	public void the_tile_under_is_a_pit() {
	    if(tileOn == "pit") {
	    	r.damage(100);
	    }
	}
	
	@When("the tile under is a healthpack")
	public void the_tile_under_is_a_healthpack() {
	    if(tileOn == "hp") {
	    	r.damage(-1);
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
