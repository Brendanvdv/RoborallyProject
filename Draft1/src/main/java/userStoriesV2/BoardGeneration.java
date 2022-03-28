//package userStoriesV2;
//
//import userStoriesV2.ResponseMessage;
//import static org.junit.Assert.assertEquals;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class BoardGeneration {
//	
//	private int playerAmount;
//	Board board = new Board();
//	ResponseMessage response;
//	
//	@Given("{int} players")
//	public void players(int int1) {
//	    this.playerAmount = int1;
//	}
//	@Given("a board")
//	public void a_board(Board b) {
//	    this.board = b;
//	}
//	@When("board has been generated")
//	public void board_has_been_generated() {
//	    board.generate();
//	}
//	@Then("place robots at opposite corners")
//	public void place_robots_at_opposite_corners() {
//	    assertEquals(response.getMessage(), "placed robots at opposite corners");
//	}
//	
//	@Given("{int} players")
//	public void players(int int1) {
//	    this.playerAmount = int1;
//	}
//	@Given("a board")
//	public void a_board(Board b) {
//	    this.board = b;
//	}
//	@When("board has been generated")
//	public void board_has_been_generated() {
//		board.generate();
//	}
//	@Then("place robots at random corners")
//	public void place_robots_at_random_corners() {
//	    assertEquals(response.getMessage(), "placed robots at random corners");
//	}
//	
//	@Given("{int} players")
//	public void players(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Given("a board")
//	public void a_board() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("board has been generated")
//	public void board_has_been_generated() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("place robots at all corners")
//	public void place_robots_at_all_corners() {
//	    assertEquals(response.getMessage(), "placed robots at random corners");
//	}
//}
