package com.bl.programs;

import java.util.LinkedList;
import java.util.Scanner;

public class StockAccount {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account name::");
		String file = scanner.nextLine();
		Stockaccount(file);
		
		System.out.println("Enter value in $::");
		double val = scanner.nextDouble();
		ValueOf(val);
		
		System.out.print("Enter symbol::");
		String symbol = scanner.next();
		System.out.print("Enter ammount::");
		double ammount = scanner.nextDouble();
		Buy(ammount, symbol);
		
		System.out.print("Enter symbol::");
		String symbol1 = scanner.next();
		System.out.print("Enter ammount::");
		double ammount1 = scanner.nextDouble();
		sell(ammount1, symbol1);
		
		System.out.print("Enter file name to save::");
		String symbol2 = scanner.next();
		Save(symbol2);
		
		System.out.println("File name:: " +file);
		System.out.println("Total Value of Account:: " +val);
		System.out.println("Want to buy a share and stck of ::\n Symbol::" +symbol+ "\t Ammount::" +ammount);
		System.out.println("Want to sell a share and stck of ::\n Symbol::" +symbol1+ "\t Ammount::" +ammount1);
		System.out.println("File saved to account");
		
		
	}

	private static void Save(String symbol2) {
		// TODO Auto-generated method stub
		System.out.println("Waiting to save file");
		
	}

	private static int sell(double ammount1, String symbol1) {
		// TODO Auto-generated method stub
		return (int) ammount1;
	}

	private static void Buy(double ammount, String symbol) {
		// TODO Auto-generated method stub	
		//System.out.println("Ammount:: " +ammount+ "Symbol:: " +symbol);
	}

	private static int ValueOf(double val) {
		// TODO Auto-generated method stub
		return (int) (val=val);
	}

	public static String Stockaccount(String file) {
		// TODO Auto-generated method stub
		return file = file;
		
	}

}
