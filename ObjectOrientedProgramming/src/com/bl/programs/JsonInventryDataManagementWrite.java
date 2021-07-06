package com.bl.programs;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonInventryDataManagementWrite {
	//Importing JSON simple library
	
	//Creating a public class
	//public class JsonEncode {
	//Calling the main method
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	// for Wheat
		
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name::");
		String name1 = scanner.next();
		System.out.print("Enter Weight per kg::");
		int weightPerKg1 = scanner.nextInt();
		System.out.print("Enter Price::");
		int price1 = scanner.nextInt();
	JSONObject Wheats = new JSONObject();
	Wheats.put("name", name1);
	Wheats.put("Weight", weightPerKg1);
	Wheats.put("Price", price1);	
		
	// for Pulses
		System.out.print("Enter name::");
		String name2 = scanner.next();
		System.out.print("Enter Weight per kg::");
		int weightPerKg2 = scanner.nextInt();
		System.out.print("Enter Price::");
		int price2 = scanner.nextInt();
	JSONObject Pulses = new JSONObject();
	Pulses.put("name", name1);
	Pulses.put("Weight", weightPerKg1);
	Pulses.put("Price", price1);	
	
	
	// for  rice
		System.out.print("Enter name::");
		String name = scanner.next();
		System.out.print("Enter Weight per kg::");
		int weightPerKg = scanner.nextInt();
		System.out.print("Enter Price::");
		int price = scanner.nextInt();
	JSONObject Rice = new JSONObject();
	Rice.put("name", name);
	Rice.put("Weight", weightPerKg);
	Rice.put("Price", price);	
	
	JSONArray StudentArray = new JSONArray();
	
	 StudentArray.add(Rice);
	 StudentArray.add(Pulses);
	 StudentArray.add(Wheats);
	 try (FileWriter file = new FileWriter("F:\\json\\dataManagement.json")) {
			//File Writer creates a file in write mode at the given location 
			file.write(StudentArray.toJSONString());

			//write function is use to write in file,
			//here we write the Json object in the file
			file.flush();

		}
		catch (IOException e) {
			e.printStackTrace();
		}

	System.out.println("----------------Data added to Json File SuccessFully --------------------------");
		//to print our JSon object 
	}
}
