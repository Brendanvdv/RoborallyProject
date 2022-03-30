package amirrobot;

import java.awt.FlowLayout;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JFrame;

public class Demo {
    public static void main(String[] args) throws MalformedURLException, IOException {
	Board b = new Board(11,11);
	Card c = new Card();
	Game g = new Game();
	Tiles t = new Tiles();
	Robot r = new Robot(b);
	Player p = new Player();

	b.makeBoard();
	b.printBoard();


	JFrame frame = new JFrame("The Board");

	frame.setLayout(new FlowLayout(FlowLayout.CENTER));
	frame.setSize(1000,700);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	

	for (int i = 0; i < i+1; i++) {
	    System.out.println("ROUND: " + (i+1));
	    c.makeCards();
	    c.printCard();

	    Panel pnl = new Panel(b,r);
	    frame.add(pnl);

	    Buttons bt = new Buttons(p,c);
	    frame.add(bt);
	    frame.setVisible(true);

	    do {
		System.out.print("");
	    } while(!bt.isReady());

	    frame.remove(bt);
	    frame.remove(pnl);

	    p.readHand(bt);
	    p.print();

	    g.execCards(p, r, b);

	    frame.setVisible(false);
	}
    }
}
