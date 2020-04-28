package insulinPumpPackage;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class displayButtons extends JPanel implements ActionListener {
	JButton bBat, bInsulin, bSensor, bPump, bDelivery , bNeedle, bRes, bTime, bInLevel;
	JFrame timeFrame;
	public JLabel label;
	
	
	public displayButtons() {

		 label = new JLabel("Insulin Pump Alarms");
		 label.setFont(new Font("Serif", Font.BOLD, 20));
		 label.setVerticalAlignment(JLabel.CENTER);
		 label.setHorizontalAlignment(JLabel.CENTER);
	     
	     label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK)); 		 
		 label.setFont(new Font("Serif", Font.BOLD, 40));
		 
		 

	     
	     //time button
	     bTime = new JButton("Time");
	     bTime.setMnemonic(KeyEvent.VK_I);
	     bTime.setActionCommand("display time");
	     
	       
		//Instantiate the battery JButton
		bBat = new JButton("Battery");		
		bBat.setMnemonic(KeyEvent.VK_B);
		bBat.setActionCommand("display battery level");
		
		//Instantiate the insulin  JButton
		bInsulin = new JButton("Insulin"); 
		bInsulin.setMnemonic(KeyEvent.VK_I);
		bInsulin.setActionCommand("display insulin level");
		
		bSensor = new JButton("Sensor");
		bSensor.setMnemonic(KeyEvent.VK_I);
		bSensor.setActionCommand("display sensor failure");
		
		bPump = new JButton("Pump");
		bPump.setMnemonic(KeyEvent.VK_I);
		bPump.setActionCommand("display Pump failure");
		
		bDelivery = new JButton("Delivery");
		bDelivery.setMnemonic(KeyEvent.VK_I);
		bDelivery.setActionCommand("display Delivery failure");
		
		bNeedle = new JButton("Needle");
		bNeedle.setMnemonic(KeyEvent.VK_I);
		bNeedle.setActionCommand("display Needle failure");
		
		bRes = new JButton("Reservoir");
		bRes.setMnemonic(KeyEvent.VK_I);
		bRes.setActionCommand("display Res failure");
		
		bInLevel = new JButton("I-Level");
		bInLevel.setMnemonic(KeyEvent.VK_I);
		bInLevel.setActionCommand("display Insulin Level");
		
		
		//listen for actions
		bTime.addActionListener(this);
		bBat.addActionListener(this);
		bInsulin.addActionListener(this);		
		bSensor.addActionListener(this);
		bPump.addActionListener(this);
		bDelivery.addActionListener(this);
		bNeedle.addActionListener(this);
		bRes.addActionListener(this);
		bInLevel.addActionListener(this);
		

		//add components		
		add(label, BorderLayout.CENTER);
		add(bTime);

		//add components
		add(label, BorderLayout.NORTH);
		add(bBat);
		add(bInsulin);
		add(bSensor);
		add(bPump);
		add(bDelivery);
		add(bNeedle);
		add(bRes);
		add(bInLevel);
		
				
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		// TODO Auto-generated method stub
		if("display battery level".equals(e.getActionCommand())) {
			bBat.setEnabled(true);
			fileTestCases testcase = new fileTestCases();

			testcase.createBatteryTestCase(1);

			testcase.createBatteryTestCase(2);

			testcase.readBatteryTestCase();
			
			
		}
		
		else if("display time".equals(e.getActionCommand())) {
			DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			Date dateobj = new Date();			
			
			JLabel tl = new JLabel("Clock: " + df.format(dateobj));
			tl.setVerticalAlignment(JLabel.CENTER);
			tl.setHorizontalAlignment(JLabel.CENTER);
			tl.setFont(new Font("Verdana", Font.PLAIN, 20));
		    tl.setPreferredSize(new Dimension(250, 100));
		    
		     
			
			timeFrame = new JFrame("Time Display: " + df.format(dateobj));			
			timeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
			
			
			timeFrame.add(tl);
			System.out.println(df.format(dateobj));
			
			timeFrame.pack();
	        timeFrame.setVisible(true);
	        timeFrame.setSize(300,300);
	        
		}
		
		else if("display insulin level".equals(e.getActionCommand())) {			
			bInsulin.setEnabled(true);
			fileTestCases testcase = new fileTestCases();

			testcase.createInsulinTestCase(1);

			testcase.createInsulinTestCase(2);

			testcase.readInsulinTestCase();
			
		}
		else if("display sensor failure".equals(e.getActionCommand())) {	
			System.out.println("SENSOR");
			bSensor.setEnabled(true);
			fileTestCases testcase = new fileTestCases();

			testcase.createSensorFailureTestCase(1);

			testcase.createSensorFailureTestCase(2);

			testcase.readSensorFailureTestCase();
			
		
		}
		else if("display Pump failure".equals(e.getActionCommand())) {	
			System.out.println("PUMP");
			bPump.setEnabled(true);
			fileTestCases testcase = new fileTestCases();

			testcase.createPumpFailureTestCase(1);

			testcase.createPumpFailureTestCase(2);

			testcase.readPumpFailureTestCase();
			
		
		}
		else if("display Delivery failure".equals(e.getActionCommand())) {	
			System.out.println("DELIVERY");
			bDelivery.setEnabled(true);
			fileTestCases testcase = new fileTestCases();
			testcase.createDeliveryFailureTestCase(2);
			testcase.readDeliveryFailureTestCase();
			
		
		}
		else if("display Needle failure".equals(e.getActionCommand())) {	
			System.out.println("NEEDLE");
			bNeedle.setEnabled(true);
			fileTestCases testcase = new fileTestCases();

			testcase.createNeedleAssemblyRemovedTestCase(1);

			testcase.createNeedleAssemblyRemovedTestCase(2);

			testcase.readNeedleAssemblyRemovedTestCase();
			
		
		}
		else if("display Res failure".equals(e.getActionCommand())) {		
			System.out.println("RES");
			bRes.setEnabled(true);
			fileTestCases testcase = new fileTestCases();

			testcase.createInsulinReservoirRemovedTestCase(1);

			testcase.createInsulinReservoirRemovedTestCase(2);

			testcase.readInsulinReservoirRemovedTestCase();
			
		
		}
		else if("display Insulin level".equals(e.getActionCommand())){
			bInLevel.setEnabled(true);
			
			fileTestCases testcase = new fileTestCases();
			
			testcase.createInsulinPumpTestCase();
			
			testcase.readInsulinPumpTestCase();
			
		}
	}
	

}
