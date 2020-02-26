package insulinPumpPackage;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Battery level and Insulin level");
		do {
		System.out.println("Enter Battery level");
		int batteryLevel = scanObj.nextInt();
		System.out.println("Enter Insulin Level");
		int insulinLevel = scanObj.nextInt();
		insulinPump ip = new insulinPump(batteryLevel,insulinLevel);
		System.out.println("Battery Level: " + ip.getBatteryLevel());
		if(ip.alarmBatteryLevel())
		{
			System.out.println("Battery Low");
		}
		else 
		{
			System.out.println("Battery Fine");
		}
		System.out.println("Insulin Level: " + ip.getInsulinLevel());
		if(ip.alarmInsulinLevel())
			{
				System.out.println("Insulin Low");
			}
		else 
			{
				System.out.println("Insulin Fine");
			}
		System.out.println("Enter 0 to quit or another number to keep going.");
		}while(scanObj.nextInt()!=0);
	}

}
