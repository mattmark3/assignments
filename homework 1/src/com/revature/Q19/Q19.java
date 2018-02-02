package com.revature.Q19;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add(i + 1);
		}
		System.out.println(arr);
		int even = 0;
		int odd = 0;
		for (Integer integer : arr) {			
			if (integer % 2 == 0){
				even += integer;
			}else {
				odd += integer;
			}
		}
		System.out.println("sum of even " + even);
		System.out.println("sum of odd " + odd);
  		
		System.out.println(arr);
	}
}
