package com.revature.Q13;

public class Q13 {
	
	public static void main(String[] args) {
		
		int stream = 1;
		
		for(int i = 1; i<=4;i++) {
			
			StringBuilder a = new StringBuilder();
			
			for(int j = 0; j < i; j++){
				
				stream = (stream == 1)? 0 : 1;
				a.append(stream + " ");
			}
			System.out.println(a);
		}
	}
}
