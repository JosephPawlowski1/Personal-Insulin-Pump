package insulinPumpPackage;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
public class fileTestCases {

	public insulinPump pump = new insulinPump();
	public fileTestCases(int numOfTestCases) {
		super(); 
		creatBatteryTestCase(numOfTestCases);
		creatInsulinTestCase(numOfTestCases);
		readBatteryTestCase();	
		readInsulinTestCase();
	
	}
	
	public boolean creatBatteryTestCase(int numOfTestCases) {
		
		try {
		      FileWriter myWriter = new FileWriter("batteryTestCaseFile.txt");
		      myWriter.write("Battery Level Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 99) + 1 + " ";
		      }
		      myWriter.write(testCases);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      return false; 
		    }
		return true;
		
	}
	public boolean creatInsulinTestCase(int numOfTestCases) {
		
		try {
		      FileWriter myWriter = new FileWriter("insulinTestCaseFile.txt");
		      myWriter.write("Insulin Level Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 99) + 1 + " ";
		      }
		      myWriter.write(testCases);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      return false; 
		    }
		return true;
		
		
	}
	public boolean readBatteryTestCase() {
		
		try {
		      File myObj = new File("batteryTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      	
		        System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testBatteryLevel(data.split(" "));

		      myReader.close();
		      if (myObj.delete()) { 
		          System.out.println("Deleted the file: " + myObj.getName());
		        } else {
		          System.out.println("Failed to delete the file.");
		        } 
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      return false;
		    }
	 
		return true;
		
	}
	public boolean readInsulinTestCase() {
		
		try {
		      File myObj = new File("insulinTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testInsulinLevel(data.split(" "));
		      myReader.close();
		      if (myObj.delete()) { 
		          System.out.println("Deleted the file: " + myObj.getName());
		        } else {
		          System.out.println("Failed to delete the file.");
		        } 
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      return false;
		    }
	 
		return true;
		
	}
	public void testBatteryLevel(String[] data) {
		
		for (int i = 0; i< data.length; i++) {
			pump.setBatteryLevel(Integer.parseInt(data[i]));
			pump.alarmBatteryLevel();
		}
		
	}
	public void testInsulinLevel(String[] data) {
		
		for (int i = 0; i< data.length; i++) {
			pump.setInsulinLevel(Integer.parseInt(data[i]));
			pump.alarmInsulinLevel();
		}
		
	}
	
	
}
