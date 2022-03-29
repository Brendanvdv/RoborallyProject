package amirrobot;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.*;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws MalformedURLException, IOException {
	Board b = new Board(12,12);

	Card c = new Card();

	Game g = new Game();
	Tiles t = new Tiles();

	b.makeBoard();
	b.printBoard();

//	System.out.println("Direction: " + r.getDir() + " Col: " + r.getrCol() + " Row: " + r.getrRow());

	//	for (int i = 0; i < 10; i++) {
	//	    c.makeCards();
	//	    c.printCard(); 
	//	}





	JFrame frame = new JFrame("The Board");

	frame.setLayout(new FlowLayout(FlowLayout.CENTER));
	frame.setSize(1000,700);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	Robot r = new Robot(b);
	Player p = new Player();

//	for (int i = 0; i < i + 1; i++) {
//	    Robot[] robots = new Robot[2];
//	    Player[] player = new Player[2];
//	}

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







	//	Buttons bt = new Buttons(p,c);
	//	bt.setSize(300, 300);
	//	bt.setVisible(true);
	//
	//	do {
	//	    System.out.print("");
	//	} while(!bt.isReady());
	//	
	//	p.readHand(bt);
	//
	//	g.execCards(p, r, b);



	//	System.out.println("Direction: " + r.getDir() + " Col: " + r.getrCol() + " Row: " + r.getrRow());
	//	System.out.println();




    }


}