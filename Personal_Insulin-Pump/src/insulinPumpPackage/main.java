package insulinPumpPackage;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
	
	
	 private static void createAndShowGUI() {
	        //Make sure we have nice window decorations.
	        JFrame.setDefaultLookAndFeelDecorated(true);
	 
	        //Create and set up the window.
	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Add the ubiquitous "Hello World" label.
	        JLabel label = new JLabel("Hello World");
	        frame.getContentPane().add(label);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		fileTestCases testcase = new fileTestCases(10);
	}

}
