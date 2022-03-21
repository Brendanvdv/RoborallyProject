package DraftUserStories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeBoard1 {
	
	private String diff;
	private int amount;
	
	Board b = new Board();
	
	@Given("I want to make a board with difficulty hard")
	public void i_want_to_make_a_board_with_difficulty(String diff) {
	    this.diff = diff;
	}
	@When("I initialize {int} boards")
	public void i_initialize_boards(Integer int1) {
		this.amount = int1;
	    b.initBoard(this.diff);
	}
	@Then("make board with obstacle range between {int} and {int}")
	public void make_board_with_obstacle_range_between_and(Integer int1, Integer int2) {
	    b.checkObstacleNumber(int1, int2, this.amount);
	}

}
