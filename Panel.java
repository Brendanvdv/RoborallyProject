package amirrobot;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Panel extends JPanel {
    private static final long serialVersionUID = 3023910913543183787L;

    //    private JLabel image = new JLabel();

    private JLabel tiles[][];

    class JLabel1 extends JLabel {
	private int XS;
	
	public JLabel1(ImageIcon i, Robot r) {
	    super(i);
	    setXS(r.getDir());
	
	}

	@Override
	public void paintComponent(Graphics g) {
	    
	    Graphics2D gx = (Graphics2D) g;
	    int x = 270;
	    if(getXS() == 3) {
		x = 0;
	    } else if (getXS()  == 1) {
		x = 180;
	    } else if (getXS()  == 2) {
		x = 90;
	    } else {
		x = 270;
	    }
//	    
	    gx.rotate(Math.toRadians(x),33,33);
	    super.paintComponent(g);
	}
//	Math.toRadians(90)

	public int getXS() {
	    return XS;
	}

	public void setXS(int xS) {
	    XS = xS;
	}
    }



    public Panel(Board b, Robot r) throws MalformedURLException, IOException {

	this.setLayout(new GridLayout(b.width(),b.height()));
	tiles = new JLabel[b.width()][b.height()];
	createTiles(b,r);
	loadTiles();
    }

    public void loadTiles() {
	for (int i = 0; i < tiles.length; i++) {
	    for (int j = 0; j < tiles[0].length; j++) {	
		this.add(tiles[j][i]);
	    }
	}
    }


    public void createTiles(Board b, Robot r) throws MalformedURLException, IOException {
	Tiles t = new Tiles();

	String pathR = t.pullTile("R");
	File fileR = new File(pathR);


	BufferedImage imageR = ImageIO.read(fileR);
	ImageIcon imageIconR = new ImageIcon(imageR);




	for (int i = 0; i < tiles.length; i++) {
	    for (int j = 0; j < tiles[0].length; j++) {	



		String path = t.pullTile(b.pull(i, j));
		File file = new File(path);


		BufferedImage image = ImageIO.read(file);
		ImageIcon imageIcon = new ImageIcon(image);

		tiles[i][j] = new JLabel(imageIcon);

	    }
	}

	tiles[r.getrCol()][r.getrRow()] = new JLabel1(imageIconR, r);
	
	

    }



}




