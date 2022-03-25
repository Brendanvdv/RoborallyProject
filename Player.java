package amirrobot;

import java.util.Scanner;
import java.util.ArrayList;

public class Player {
	private boolean playerNumber1 = false;
	private ArrayList<String> hand = new ArrayList<String>();
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
			hand.add(c.getCard(x));
			c.rmv(x);
			c.printCard();
			System.out.println(hand.get(i));
			
		}
	}
	
	public void readHand(Buttons bt) {
	    for (int j = 0; j < bt.get().size(); j++) {
		hand.add(bt.get().get(j));
	    }
	}
	
	
	
	public String getHand(int i) {
		return hand.get(i);
	}
	
}