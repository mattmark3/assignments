package com.revature.Q14;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1 for root");
		System.out.println("enter 2 for date");
		System.out.println("enter 3 for message");
		
		switch(scan.nextLine()) {
		
		case "1":
			System.out.println("Enter number");
			System.out.println(Math.sqrt(scan.nextDouble()));
			break;
		case "2":
			Date d = new Date();
			System.out.println(d.getDate());
			break;
		case "3":
			String s = "I am learning Core Java.";
			String[] arr = s.split(" ");
			for (String string : arr) {
				System.out.println(string);
			}
			
			break;
		}
		System.out.println("done");
	}
}
