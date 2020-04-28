package insulinPumpPackage;

import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

import javax.swing.JOptionPane;
public class fileTestCases {

	public insulinPump pump = new insulinPump();
	public fileTestCases(int numOfTestCases) {
		super(); 
		//creatBatteryTestCase(numOfTestCases);
		//creatInsulinTestCase(numOfTestCases);
		//readBatteryTestCase();	
		//readInsulinTestCase();
		//createInsulinPumpTestCase();
		//readInsulinPumpTestCase();
	
	}
	
	public fileTestCases() {
		createInsulinPumpTestCase();
		readInsulinPumpTestCase();
	}
	
	
	public boolean createBatteryTestCase(int numOfTestCases) {
		
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
	public boolean createInsulinTestCase(int numOfTestCases) {
		
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
	public boolean createSensorFailureTestCase(int numOfTestCases) {

		try {
		      FileWriter myWriter = new FileWriter("sensorFailureTestCaseFile.txt");
		      myWriter.write("Sensor Failure Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 1) + 0 + " ";
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
	public boolean createPumpFailureTestCase(int numOfTestCases) {
		try {
		      FileWriter myWriter = new FileWriter("pumpFailureTestCaseFile.txt");
		      myWriter.write("Insulin Level Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 1) + 0 + " ";
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
	public boolean createDeliveryFailureTestCase(int numOfTestCases) {
		try {
		      FileWriter myWriter = new FileWriter("deliveryFailureTestCaseFile.txt");
		      myWriter.write("Insulin Level Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 2) + 0 + " ";
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
	public boolean createNeedleAssemblyRemovedTestCase(int numOfTestCases) {
		try {
		      FileWriter myWriter = new FileWriter("needleAssemblyRemovedTestCaseFile.txt");
		      myWriter.write("Insulin Level Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 2) + 0 + " ";
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
	public boolean createInsulinReservoirRemovedTestCase(int numOfTestCases) {
		try {
		      FileWriter myWriter = new FileWriter("insulinReservoirRemovedTestCaseFile.txt");
		      myWriter.write("Insulin Level Test\n");
		      String testCases= "";
		      for(int i = 0; i < numOfTestCases; i++) {
		    	  testCases += (int) (Math.random()* 2) + 0 + " ";
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
	public boolean createInsulinPumpTestCase() {
		try {
			int[] arr = {-15,-10,-5,0,5,10,15};
			FileWriter myWriter = new FileWriter("InsulinPumpTestFile.txt");
			myWriter.write("Insulin Level Test\n");
			String testCases="";
			int numOfTestInOneDay = 144;
			int sugerLevel = 100;
			for(int i = 0; i< numOfTestInOneDay; i++ ) {				
				if(sugerLevel  > 350){
					sugerLevel = sugerLevel - 30;
				}else if(sugerLevel < 75){
					sugerLevel = sugerLevel + 30;
				}else{

				sugerLevel = sugerLevel + arr[(int) (Math.random() * 6) + 0];

				}
				testCases += sugerLevel + " ";

			}
			myWriter.write(testCases);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean readInsulinPumpTestCase() {
		try {
			File myObj = new File("InsulinPumpTestFile.txt");
			Scanner myReader = new Scanner(myObj);
			System.out.println(myReader.nextLine());
			String data = myReader.nextLine();
			testInsulinPump(data.split(" "));
			myReader.close();
			if(myObj.delete()) {
				System.out.println("Deleted the file: " + myObj.getName());
			}else {
				System.out.println("Problem deleting the file");
			}
		}catch(FileNotFoundException e){
			System.out.println("An error occurred");
			e.printStackTrace();
			return false;
			
		}
		return true;
		
	}
	

	private void testInsulinPump(String[] split) {
		int numOfTimeInsulinPump=0;
		for(int i=2; i< split.length-3; i++)
		{
			numOfTimeInsulinPump = numOfTimeInsulinPump +pump.pumpInsulin(split[i-2],split[i-1],split[i]);
		}
		System.out.println("Test ended");
		String message = numOfTimeInsulinPump * 4 + " ML of insulin was pumped today";
		JOptionPane.showMessageDialog(null, message);
		
		
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
	public boolean readSensorFailureTestCase() {
		try {
		      File myObj = new File("sensorFailureTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testSensorFailure(data.split(" "));
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
	private void testSensorFailure(String[] data) {
		for (int i = 0; i< data.length; i++) {
			pump.setSensorFailure(Integer.parseInt(data[i]));
			pump.alarmSensorFailure();
		}
		
	}

	public boolean readPumpFailureTestCase() {
		try {
		      File myObj = new File("pumpFailureTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testPumpFailure(data.split(" "));
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
	private void testPumpFailure(String[] data) {
		for (int i = 0; i< data.length; i++) {
			pump.setPumpFailure(Integer.parseInt(data[i]));
			pump.alarmPumpFailure();
		}
		
	}

	public boolean readDeliveryFailureTestCase() {
		try {
		      File myObj = new File("deliveryFailureTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testDeliveryFailure(data.split(" "));
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
	private void testDeliveryFailure(String[] data) {
		for (int i = 0; i< data.length; i++) {
			pump.setDeliveryFailure(Integer.parseInt(data[i]));
			pump.alarmDeliveryFailure();
		}
		
	}

	public boolean readNeedleAssemblyRemovedTestCase() {
		try {
		      File myObj = new File("needleAssemblyRemovedTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testNeedleAssemblyRemoved(data.split(" "));
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
	private void testNeedleAssemblyRemoved(String[] data) {
		for (int i = 0; i< data.length; i++) {
			pump.setNeedleAssemblyRemoved(Integer.parseInt(data[i]));
			pump.alarmNeedleAssemblyRemoved();
		}
		
	}

	public boolean readInsulinReservoirRemovedTestCase() {
		try {
		      File myObj = new File("insulinReservoirRemovedTestCaseFile.txt");
		      Scanner myReader = new Scanner(myObj);
		      System.out.println(myReader.nextLine());
		        String data = myReader.nextLine();
		        
		        testInsulinReservoirRemoved(data.split(" "));
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
	private void testInsulinReservoirRemoved(String[] data) {
		for (int i = 0; i< data.length; i++) {
			pump.setInsulinReservoirRemoved(Integer.parseInt(data[i]));
			pump.alarmInsulinReservoirRemoved();
		}
		
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
