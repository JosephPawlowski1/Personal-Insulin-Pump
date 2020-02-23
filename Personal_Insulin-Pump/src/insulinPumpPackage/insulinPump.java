package insulinPumpPackage;
public class insulinPump {

	private static int batteryLevel;
	private static int insulinLevel;
	public  insulinPump (int batteryLevel,int insulinLevel) {
		this.batteryLevel = batteryLevel;
		this.insulinLevel = insulinLevel;
	}
	
	
	public static int getBatteryLevel()
	{
		
		return batteryLevel;
	}
	public static boolean alarmBatteryLevel()
	{
		
		int batteryLevel = getBatteryLevel();
		if(batteryLevel< 20 )
		{
			return true; 
		}
			return false; 
	}
	public static int getInsulinLevel()
	{
		return insulinLevel;
	}
	public static boolean  alarmInsulinLevel()
	{
		int insulinLevel = getInsulinLevel();
		if(insulinLevel < 20)
		{
			return true;
		}
			return false; 
	}
}
	
