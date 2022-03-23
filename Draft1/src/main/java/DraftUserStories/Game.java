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
	
	public void execCards(Player p, Robot r, Board b) {
		for(int i = 0; i<4; i++) {
			if(p.getHand(i).equals("Move 1") ) {
				r.valid_move(b, 1);
			} else if(p.getHand(i).equals("Move 2")) {
				r.valid_move(b, 2);
			} else if(p.getHand(i).equals("Move 3")) {
				r.valid_move(b, 3);
			} else if(p.getHand(i).equals("Rotate Left")) {
				r.rotate(1);
			} else if(p.getHand(i).equals("Rotate Right")) {
				r.rotate(3);
			} else if(p.getHand(i).equals("U-turn")) {
				r.rotate(2);
			} else {
				System.out.println("error");
			}
		}
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
