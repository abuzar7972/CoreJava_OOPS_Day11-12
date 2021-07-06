package com.bl.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventryManagementProgram {
	public static void main(String[] args) {
		
		 //JSON parser object to parse read file
       JSONParser jsonParser = new JSONParser();
        
       try (FileReader reader = new FileReader("F:\\json\\dataManagement.json"))
       {
           //Read JSON file
           Object obj = jsonParser.parse(reader);

           JSONArray studentArray = (JSONArray) obj;
           System.out.println(studentArray);
           
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ParseException e) {
           e.printStackTrace();
       }
	}

	private static void parseStduentArray(JSONObject student) {
		
		 //Get Student object within list
       JSONObject studentObject = (JSONObject) student.get("student1");
        
       //Get Studnet first name
       String firstName = (String) studentObject.get("name");
       
	   System.out.println("======================="+firstName);
	}

}
