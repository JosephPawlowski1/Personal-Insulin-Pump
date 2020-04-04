package insulinPumpPackage;

import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import javax.*;
import javax.swing.*;


 import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;

public class main {
	
	
	 private static void createAndShowGUI() {
		 	//Make sure we have nice window decorations.
	        JFrame.setDefaultLookAndFeelDecorated(true);
	 
	        //Create and set up the window.
	        JFrame frame = new JFrame("Insulin Pump Display");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        
	        
	        //Create and set up the content pane
	        displayButtons pane = new displayButtons();
	        frame.setContentPane(pane);
	        
	        
	        
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	        frame.setSize(500,200);
	        
	        
	        
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