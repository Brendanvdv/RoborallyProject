package DraftUserStories;
public class Card {
	
	private String[] card = new String[9];
	
	public void makeCards() {
		
		for (int j = 0; j < card.length; j++) {
			Double r = Math.random();
			if(r < 0.3) { //movement 1
			    card[j] = "Move 1";
			} else if(r < 0.5) { //movement 2
			    card[j] = "Move 2";
			} else if(r < 0.55) { //movement 3
				card[j] = "Move 3";
			} else if(r < 0.75) { //rotation left
				card[j] = "Rotate left";
			} else if(r < 0.95) { //rotation right
				card[j] = "Rotate right";
			} else { //rotation U turn
				card[j] = "U-turn";
		    }
		}
	}
	
	public void printCard() {
		for (int j = 0; j < card.length; j++) {
			System.out.println(j + ". " + card[j]);
		}
	}
	
	public String[] getCard() {
		return card;
	}
	
}
