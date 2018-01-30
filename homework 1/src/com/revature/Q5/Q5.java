package com.revature.Q5;

public class Q5 {
	
	public static void main(String[] args) {
		String s = "power";
		int i = 3;
		Q5 demo = new Q5();
		System.out.println(demo.subString(s,i));
	}
	
	public String subString(String s, int idx) {
		StringBuilder b = new StringBuilder(s);
		b.setLength(idx);
		String r = b.toString();
		return r;
	}
}
