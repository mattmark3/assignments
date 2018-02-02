package com.revature.Q2;

public class Q2 {

	public static void main(String[] args) {
		
		int b = 0;
		System.out.println(b + " " + 1);
		int a = 1;
		System.out.println(a + " " + 2);
		int temp;
		for(int i = 3; i < 26; i++) {
			temp = a;
			a = a + b;	
			b = temp;
			System.out.println(a + " " + i);
		}
		
	}
}
