package myProgram;

import java.awt.Color;
import javax.swing.*;

class Start {
    public static void main(String[] args) throws Exception {
    	JFrame frame = new JFrame("fignya");
    	
    	frame.setSize(600,600);
    	frame.setBackground(Color.white);
    	frame.add(new myPanel(frame));
    	frame.setVisible(true);
    	
    }
}