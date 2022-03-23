package DraftUserStories;

public class Game {
	private int counter;
	private boolean turnValue;
	private int playerAmount;
	private int[] players;
	
	
	private void kill(Robot r) {
		r = null;
		playerAmount--;
		if(playerAmount == 1) {
			endGame();
		}
	}
	
	private void endGame() {
		System.out.println("Game Over!");
	}
	
	
//	public void startGame() {
//		
//	}
	
//	public void playerTurn() {
//		turnValue = !turnValue;
//		if(turnValue) {
//			System.out.println("Player 1's Turn! \n");
//		} else {
//			System.out.println("Player 2's Turn! \n");
//		}
//	}
	
}
