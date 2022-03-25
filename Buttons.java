package amirrobot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

import references.JButtonExample.buttonAction;    

public class Buttons extends JPanel {   
    private static final long serialVersionUID = 3023910913543183787L;

    private ArrayList<String> carbut = new ArrayList<String>();
    private boolean ready;

    JButton b0 = new JButton("fadw"); 
    JButton b1; JButton b2;
    JButton b3; JButton b4; JButton b5;
    JButton b6; JButton b7; JButton b8;
    JButton[] buttons = new JButton[] {b0,b1,b2,b3,b4,b5,b6,b7,b8};

    Buttons(Player p, Card c) {
//	super("Choose your card");
	super();
	setLayout(new GridLayout(3, 3));
	makeButtons(p,c);
	setPreferredSize(new Dimension(300,300));
    }

    public void makeButtons(Player p, Card c) {
	for(int i = 0; i < 9; i++) {
	    buttons[i] = new JButton(new buttonAction());
	    add(buttons[i]); buttons[i].setText(c.getCard(i));
	}
    }
    
    public ArrayList<String> get() {
	return carbut;
    }



    public boolean isReady() {
	return ready;
    }

    public void setReady(boolean ready) {
	this.ready = ready;
    }



    class buttonAction extends AbstractAction {
	private static final long serialVersionUID = 3023910913543183787L;
	
	
	

	public void actionPerformed(ActionEvent e) {
	    
	    JButton x = (JButton) e.getSource();
	    carbut.add(x.getText());
	    System.out.println(carbut);
	    
	    
	    this.setEnabled(false);
	    if(carbut.size() == 4) {
		for(int i = 0; i < 9; i++) {
		    buttons[i].setEnabled(false);
		    setReady(true);
		}
	    }
	}
    }





}