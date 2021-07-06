package com.bl.programs;

import java.util.LinkedList;
import java.sql.Date;
import java.util.Scanner;

public class CompanyShares {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wel Come to Company Shares");
		System.out.println("Press 1 : to add shares");
		System.out.println("Press 2 : to delet shares");
		int check = scanner.nextInt();
		
		
		
		if (check == 1) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.print("Enter company share::");
		int share = scanner.nextInt();
		linkedList.add(share);
		Date date = new Date(share);
		String str = String.format("Purchesed Date/Time : %tc", date );
	      System.out.println(str);
		
		System.out.println("Press 1 to buy a new share");
		int share1 = scanner.nextInt();
		if (share1 == 1) {
			System.out.print("Enter how much stock want to purches::");
			int share2=scanner.nextInt();
		linkedList.add(share2);
		System.out.println("Stock purches SUCCESSFULLY");
		Date date1 = new Date(share2);
		String str1 = String.format("Purchesed Date/Time : %tc", date1 );
	      System.out.printf(str1);
		}
		
	      
		else {
			System.out.println("Stored your stock");
		}
		}
		else
		{
			LinkedList<Integer> linkedList = new LinkedList<>();
			System.out.print("Enter which share want to remove::");
			int share = scanner.nextInt();
			linkedList.remove(share);
		}
	}

}
