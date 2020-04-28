package insulinPumpPackage;
import javax.swing.JOptionPane;
public class insulinPump {

	private static int batteryLevel;
	private static int insulinLevel;
	private static int sensorFailure;
	private static int pumpFailure;
	private static int deliveryFailure;
	private static int needleAssemblyRemoved;
	private static int insulinReservoirRemoved;
	private static int numOfTimeInsulinPump;
	private static int numOfTimesInsulinPumpTest;
	
	public  insulinPump (int batteryLevel,int insulinLevel) {
		this.batteryLevel = batteryLevel;
		this.insulinLevel = insulinLevel;
		numOfTimeInsulinPump = 0;
		numOfTimesInsulinPumpTest =0;
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
			//System.out.println(batteryLevel + ":Battery level is good");
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
			System.out.println(insulinLevel + ": Insulin level is low");
			String message = insulinLevel + "%: Insulin level is low";
			JOptionPane.showMessageDialog(null,message);
			return true;
		}
			System.out.println(insulinLevel + ": Insulin level is good");
			String message = insulinLevel + "%: Insulin level is good";
			JOptionPane.showMessageDialog(null,message);
			return false; 
	}


	public void setSensorFailure(int parseInt) {
		// TODO Auto-generated method stub
		insulinPump.sensorFailure = parseInt;
	}


	public void alarmSensorFailure() {
		if(insulinPump.sensorFailure == 1) {
			System.out.println("Senor Failure");
			String message = "Sensor Failure";
			JOptionPane.showMessageDialog(null,message);
		}else if(insulinPump.sensorFailure == 0) {
			System.out.println("Senor Good");
			String message = "Sensor Good";
			JOptionPane.showMessageDialog(null,message);
		}
		
	}


	public void setPumpFailure(int parseInt) {
		// TODO Auto-generated method stub
		insulinPump.pumpFailure = parseInt;
	}


	public void alarmPumpFailure() {
		// TODO Auto-generated method stub
		if(insulinPump.pumpFailure == 1) {
			System.out.println("Pump Failure");
			String message = "Pump Failure";
			JOptionPane.showMessageDialog(null,message);
		}else if(this.pumpFailure == 0) {
			System.out.println("Pump Good");
			String message = "Pump Good";
			JOptionPane.showMessageDialog(null,message);
		}
	}


	public void setDeliveryFailure(int parseInt) {
		// TODO Auto-generated method stub
		insulinPump.deliveryFailure = parseInt;
	}


	  void alarmDeliveryFailure() {
		// TODO Auto-generated method stub
			if(insulinPump.deliveryFailure == 1) {
				System.out.println("Delivery Failure");
				String message = "Delivery Failure";
				JOptionPane.showMessageDialog(null,message);
			}else if(insulinPump.deliveryFailure == 0) {
				System.out.println("Delivery Good");
				String message = "Delivery Good";
				JOptionPane.showMessageDialog(null,message);
			}
			
	}


	public void setNeedleAssemblyRemoved(int parseInt) {
		// TODO Auto-generated method stub
		insulinPump.needleAssemblyRemoved = parseInt;
	}


	public void alarmNeedleAssemblyRemoved() {
		// TODO Auto-generated method stub
		if(insulinPump.needleAssemblyRemoved == 1) {
			System.out.println("Needle Assembly Removed");
			String message = "Needle Assembly Removed";
			JOptionPane.showMessageDialog(null,message);
		}else if(insulinPump.needleAssemblyRemoved == 0) {
			System.out.println("Needle Assembly Good");
			String message = "Needle Assembly Good";
			JOptionPane.showMessageDialog(null,message);
		}
		
		
	}


	public void setInsulinReservoirRemoved(int parseInt) {
		// TODO Auto-generated method stub
		insulinPump.insulinReservoirRemoved = parseInt;
	}


	public void alarmInsulinReservoirRemoved() {
		// TODO Auto-generated method stub
		if(insulinPump.insulinReservoirRemoved == 1) {
			System.out.println("Insulin Reservoir Removed");
			String message = "Insulin Reservoir Removed";
			JOptionPane.showMessageDialog(null,message);
		}else if(insulinPump.insulinReservoirRemoved == 0) {
			System.out.println("Insulin Reservoir Good");
			String message = "Insulin Reservoir Good";
			JOptionPane.showMessageDialog(null,message);
		}
	}


	public int pumpInsulin(String string, String string2, String string3) {
		int curr = Integer.parseInt(string);
		int prev = Integer.parseInt(string2);
		int prev2 = Integer.parseInt(string3);
		if(curr < 80 ) {

			//System.out.println("no insulin ");
			
		}else if(curr > 80 && curr < 200) {
			if((curr > prev) && ((Math.abs(curr - prev) > prev2))){
				//System.out.println("give insulin");
				//String message = "give insulin";
				//JOptionPane.showMessageDialog(null, message);
				numOfTimeInsulinPump = pumpIt();
				return 1;
				
			}else {
				//System.out.println("no insulin ");
				
			}
		}else if(curr > 200) {
			if((curr < prev) && ((Math.abs(curr - prev) > Math.abs(prev - prev2)))){
				//System.out.println("no insulin");
				
			}else {
				//System.out.println("give insulin");
				numOfTimeInsulinPump = pumpIt();
				return 1;

			}
		}
		
		return 0;
	}


	private int pumpIt() {
		// TODO Auto-generated method stub
		if(numOfTimeInsulinPump < 5) {
		System.out.println("Pump 4 ML of insulin");
	
		
		}else {
			System.out.println("Seek medical help");
		
		}
		return numOfTimeInsulinPump++;
		
	}
}