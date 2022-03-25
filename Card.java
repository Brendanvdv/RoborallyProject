package amirrobot;

import java.util.ArrayList;

public class Card {
	
	private ArrayList<String> card = new ArrayList<String>();
	
	public void makeCards() {
		
		for (int j = 0; j < 9; j++) {
			Double r = Math.random();
			if(r < 0.3) { //movement 1
			    card.add("Move 1");
			} else if(r < 0.5) { //movement 2
			    card.add("Move 2");
			} else if(r < 0.55) { //movement 3
			    card.add("Move 3");
			} else if(r < 0.75) { //rotation left
			    card.add("Rotate Left");
			} else if(r < 0.95) { //rotation right
			    card.add("Rotate Right");
			} else { //rotation U turn
			    card.add("U-turn");
		    }
		}
	}
	
	public void printCard() {
		for (int j = 0; j < card.size(); j++) {
			System.out.println(j + ". " + card.get(j));
		}
	}
	
	public String getCard(int i) {
		return card.get(i);
	}
	
	public void rmv(int i) {
		card.remove(i);
	}
	
}