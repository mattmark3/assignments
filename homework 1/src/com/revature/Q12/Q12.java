package com.revature.Q12;

public class Q12 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		} 
		for (int i : arr) {
			if (i% 2 == 0) {
				System.out.println(i);
			}	
		}
	}
}
