package amirrobot;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.*;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws MalformedURLException, IOException {
	Board b = new Board(9,9);
	Robot r = new Robot(b); // init robot and test tileFront
	Card c = new Card();
	Player p = new Player();
	Game g = new Game();
	Tiles t = new Tiles();
	
	b.makeBoard();
	b.printBoard();
	
	System.out.println("Direction: " + r.getDir() + " Col: " + r.getrCol() + " Row: " + r.getrRow());

	c.makeCards();
	c.printCard();
		
	
	Panel pnl = new Panel(b,r);
        JFrame frame = new JFrame("The Board");
        frame.add(pnl);
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	

	
	Buttons bt = new Buttons(p,c);
	bt.setSize(300, 300);
	bt.setVisible(true);

	do {
	    System.out.print("");
	} while(!bt.isReady());
	
	p.readHand(bt);

	g.execCards(p, r, b);

	

	System.out.println("Direction: " + r.getDir() + " Col: " + r.getrCol() + " Row: " + r.getrRow());
	System.out.println();

	


    }


}