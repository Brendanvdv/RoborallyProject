package stepRobot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import roboRally.Board;

public class BoardTests {

    private Board board;

    @Given("Length {int} and width {int}")
    public void length_and_width(Integer int1, Integer int2) {
	board = new Board(int1,int2);
    }
    
    @Then("Generate a board and intitialize it with Strings as array elements")
    public void generate_a_board_and_intitialize_it_with_strings_as_array_elements() {
	board.init();
    }
}
