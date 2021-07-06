package com.bl.programs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockAccountManagement {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i=0, valueOfStock=0, totalValue=0;
		System.out.print("Enter numbers of stocks::");
		int numberOfStock = scanner.nextInt();
		
			for(i=0; i<numberOfStock; i++) {
			
				System.out.print("Enter name::");
				String name = scanner.next();
				System.out.print("Enter number of shares::");
				int NumberOfShares = scanner.nextInt();
				System.out.print("Enter share Price::");
				int SharePrice = scanner.nextInt();
		
				JSONObject StockAccount = new JSONObject();
				StockAccount.put("Name", name);
				StockAccount.put("Number Of Shares", NumberOfShares);
				StockAccount.put("Share Price", SharePrice);
				
				valueOfStock = (NumberOfShares*SharePrice);
				System.out.println("value of stock::" +valueOfStock);
				totalValue = valueOfStock + (SharePrice*NumberOfShares) +totalValue;
	
				System.out.println(StockAccount);
				
				JSONArray StudentArray = new JSONArray();
				
				 StudentArray.add(StockAccount);
				 try (FileWriter file = new FileWriter("F:\\StockManagement.json")) {
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
			//System.out.println("total value Of Stock:: " +valueOfStock);
	}

