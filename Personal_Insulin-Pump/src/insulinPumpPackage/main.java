package insulinPumpPackage;

import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import javax.*;
import javax.swing.*;


 import java.awt.event.KeyEvent;

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
	        frame.setLayout(null);
	        
	        //JLabel layout
	        JLabel label = new JLabel("Insulin Pump Alarm");
	        label.setFont(new Font("Verdana", Font.BOLD, 20));
	        label.setBounds(40, 30, 250, 30);
	        pane.add(label);
	        
	        //layout for button options
	        int x = 80;
	        JButton arr[] = new JButton[9];
	        arr[0] = pane.bTime;
	        arr[1] = pane.bBat;
	        arr[2] = pane.bDelivery;
	        arr[3] = pane.bInsulin;
	        arr[4] = pane.bNeedle;
	        arr[5] = pane.bPump;
	        arr[6] = pane.bRes; 
	        arr[7] = pane.bSensor;
	        arr[8] = pane.bInLevel;
	        
	        for(int i = 0; i < arr.length; i++) {
	        	arr[i].setBounds(40,x,200,30);
	        	x += 40;	        	
	        }
	        
	        
	        /*
	        pane.bTime.setBounds(40,40,100,30);
	        pane.bBat.setBounds(40,80,100,30);
	        pane.bDelivery.setBounds(40,120,100,30);
	        pane.bInsulin.setBounds(40,160,100,30);
	        */
	        
	        
	        
	        
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	        frame.setSize(500,500);
	        
	        
	        
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