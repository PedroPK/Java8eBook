package com.whizlabs;

import java.util.ArrayList;
import java.util.Arrays;

public class Whizlabs {
	
	public static void main(String[] args) {
		ArrayList<String> whizlArray = part01();
		
		part02(whizlArray);
		
		part03(whizlArray);
	}

	public static void part03(ArrayList<String> whizlArray) {
		String[] ws3 = new String[1];
		ws3[0] = "Test Data";
		
		String[] ws4 = whizlArray.toArray(ws3);
		
		System.out.println("ws1 == ws2:" + (ws3 == ws4));
		System.out.println("ws1:" + Arrays.toString(ws3));
		System.out.println("ws1:" + Arrays.toString(ws4));
	}

	public static void part02(ArrayList<String> whizlArray) {
		String[] ws1 = new String[whizlArray.size()];
		String[] ws2 = whizlArray.toArray(ws1);
		
		System.out.println("ws1 == ws2:" + (ws1 == ws2));
		System.out.println("ws1:" + Arrays.toString(ws1));
		System.out.println("ws2:" + Arrays.toString(ws2));
	}

	public static ArrayList<String> part01() {
		ArrayList<String> whizlArray = new ArrayList<>();
		whizlArray.add("coke");
		whizlArray.add("pepsi");
		whizlArray.add("miranda");
		
		System.out.println("Total Array List ::" + whizlArray);
		return whizlArray;
	}
	
	/**
	 * Execution shows that the JVM jumps to then appropriate Case, without traversing
	 * all of them.
	 * 
	 * It looks to be something new in the newer JVM versions
	 * 
	 * @return
	 */
	public static String switchCaseMethod() {
		String s = "A";
		String response = "";
		
		switch (s) {
			case "a":
				response = "Lowercase a";
				System.out.println(response);
				
			default:
				response = "Default case";
				System.out.println(response);
				
			case "A":
				response = "Uppercase A";
				System.out.println(response);
				
			return response;
		}
	}
	
}