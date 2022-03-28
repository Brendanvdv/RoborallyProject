import static org.junit.Assert.assertEquals;

import DraftUserStories.Board;
import finalMainFiles.ResponseMessageV2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BoardTests {
	
	ResponseMessageV2 response;
	
	private Board b;
	int width;
	int height;
	
	// User story 1
	@Given("two integers width <w> and height <h>")
	public void two_integers_width_w_and_height_h(int w, int h) {
	    this.width = w;
	    this.height = h;
	    b = new Board(width, height);
	}    
	
	@When("check-in")
	public void check_in() {
		response = b.getResponse();	    
	}
	
	
	@Then("define board")
	public void define_board() {
	    assertEquals(response.getMessage(), "board defined");
	}
	
	// User story 2
}
