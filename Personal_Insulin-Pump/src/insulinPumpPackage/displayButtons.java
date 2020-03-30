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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class displayButtons extends JPanel implements ActionListener {
	JButton bBat, bInsulin; 
	public displayButtons() {
		 JLabel label = new JLabel("Display Battery or Insulin Level?");
		 label.setFont(new Font("Serif", Font.BOLD, 30));
	     
	     label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
	       
		//Instantiate the battery JButton
		bBat = new JButton("Battery");		
		bBat.setVerticalTextPosition(AbstractButton.CENTER);
		bBat.setHorizontalTextPosition(AbstractButton.LEADING);
		bBat.setMnemonic(KeyEvent.VK_B);
		bBat.setActionCommand("display battery level");
		
		//Instantiate the insulin  JButton
		bInsulin = new JButton("Insulin"); //default CENTER, TRAILING
		bInsulin.setMnemonic(KeyEvent.VK_I);
		bInsulin.setActionCommand("display insulin level");
		
		//listen for actions
		bBat.addActionListener(this);
		bInsulin.addActionListener(this);		
		
		//add components
		add(label, BorderLayout.CENTER);
		add(bBat);
		add(bInsulin);
		
				
	}	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("display battery level".equals(e.getActionCommand())) {
			bBat.setEnabled(true);
			fileTestCases testcase = new fileTestCases();
			testcase.creatBatteryTestCase(5);
			testcase.readBatteryTestCase();
			
		}
		
		else {			
			bInsulin.setEnabled(true);
			fileTestCases testcase = new fileTestCases();
			testcase.creatInsulinTestCase(5);
			testcase.readInsulinTestCase();
			
		}
			
		
			
		
		
	}
	

}
