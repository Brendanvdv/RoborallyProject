package DraftUserStories;

import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeBoard {
	private int setting;
//	private Random rnd = new Random();
//	private String[][] board;
	Board b = new Board();
	
	@Given("difficulty setting of {int}")
	public void difficulty_setting_of(Integer int1) {
	    this.setting = int1;
	}
	
	@When("initializing board")
	public void initializing_board() {
		b.initBoard(this.setting);
//	    board = new String[10][20];
//	    
//	    for (int j = 0; j < board.length; j++) {
//			for (int i = 0; i < board.length; i++) {
//				Double r = rnd.nextDouble();
//				
//				if(r < 0.65) {
//					board[j][i] = "T";
//				} else if(r < 0.7) {
//					board[j][i] = "P";
//				} else if(r < 0.75) {
//					board[j][i] = "B";
//				} else if(r < 0.8) {
//					board[j][i] = "L";
//				} else if(r < 0.85) {
//					board[j][i] = "A";
//				} else if(r < 0.9) {
//					board[j][i] = "H";
//				} else if(r < 0.95) {
//					board[j][i] = "C";
//				} else {
//					board[j][i] = "G";
//				}
//				System.out.print(board[j][i] + "  ");
//			}
//			System.out.println();
		}
	}
	
	@Then("produce twoD array of strings")
	public void produce_two_d_array_of_strings() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
