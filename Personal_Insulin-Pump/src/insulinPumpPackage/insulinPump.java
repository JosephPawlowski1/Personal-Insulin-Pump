package insulinPumpPackage;
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
			System.out.println(batteryLevel + ": Battery level is low");
			return true; 
		}
			System.out.println(batteryLevel + ": Battery level is good");
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
			return true;
		}
			System.out.println(insulinLevel + ": Insulin level is good");
			return false; 
	}
}
	
