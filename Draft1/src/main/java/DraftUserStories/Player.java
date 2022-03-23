package DraftUserStories;
import java.util.Scanner;

public class Player {
	private boolean playerNumber1 = false;
	private String[] hand = new String[4];
	Scanner s = new Scanner(System.in);
	
	public void printPlayer() {
		playerNumber1 = !playerNumber1;
		if(playerNumber1) {
			System.out.println("Player 1's Turn! \n");
		} else {
			System.out.println("Player 2's Turn! \n");
		}
	}
	
	public int getPlayerNumber() {
		if(playerNumber1) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public void readHand(Card c) {
		for(int i = 0; i < 4; i++) {
			System.out.print("Select cards in order: ");
			int x = s.nextInt();
			hand[i] = c.getCard()[x];
		}
	}
	
}
