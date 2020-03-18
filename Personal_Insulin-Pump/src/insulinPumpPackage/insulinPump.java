package insulinPumpPackage;
import javax.swing.*;
public class insulinPump {

	private static int batteryLevel;
	private static int insulinLevel;
	public  insulinPump (int batteryLevel,int insulinLevel) {
		this.batteryLevel = batteryLevel;
		this.insulinLevel = insulinLevel;
	}
	
	
	public insulinPump() {
		// TODO Auto-generated constructor stub
	}


	public void setBatteryLevel(int batteryLevel) {
		insulinPump.batteryLevel = batteryLevel;
	}


	public void setInsulinLevel(int insulinLevel) {
		insulinPump.insulinLevel = insulinLevel;
	}


	public static int getBatteryLevel()
	{
		
		return batteryLevel;
	}
	public boolean alarmBatteryLevel()
	{
		
		int batteryLevel = getBatteryLevel();
		if(batteryLevel< 20 )
		{
			
			//System.out.println(batteryLevel + ": Battery level is low");
			String message = batteryLevel + "%: Battery level is low";
			JOptionPane.showMessageDialog(null, message);
			return true; 
		}
			//System.out.println(batteryLevel + ": Battery level is good");
			String message = batteryLevel + "%: Battery level is good";
			JOptionPane.showMessageDialog(null, message);
			return false; 
	}
	public static int getInsulinLevel()
	{
		return insulinLevel;
	}
	public boolean  alarmInsulinLevel()
	{
		int insulinLevel = getInsulinLevel();
		if(insulinLevel < 20)
		{
			//System.out.println(insulinLevel + ": Insulin level is low");
			String message = insulinLevel + "%: Insulin level is low";
			JOptionPane.showMessageDialog(null, message);
			return true;
		}
			//System.out.println(insulinLevel + ": Insulin level is good");
			String message = insulinLevel + "%: Insulin level is good";
			JOptionPane.showMessageDialog(null, message);
			return false; 
	}
}
	
