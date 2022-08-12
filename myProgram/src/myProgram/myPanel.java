package myProgram;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class myPanel extends JPanel{

	private BufferedImage image;
	private int imageX = 0;
	private int imageY = 0;
	private int x, y;
	private JFrame frame;
	
	myPanel(JFrame frame){
		try {
			image = ImageIO.read(new File("200x200.jpg"));
		}
		catch (IOException e) {
			
		}
		
		this.frame = frame;
		x = frame.getWidth();
		y = frame.getHeight();
		
		Timer t = new Timer(10, al);
		t.start();
	}
	
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, x, y);

		g.drawImage(image, imageX, imageY, this);			
		
	}
	
	private ActionListener al = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			if (imageX > x && imageY > y) {
				imageY = imageX = 0 - image.getHeight();
			}
			imageX += 2;
			imageY += 2;
			
			repaint();
		}
	};
		
}