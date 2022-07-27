package com.bridege.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		
		sortStringList();
	}
	
	private static void sortStringList() {
		List<String> stringList = new ArrayList<>();
		stringList.add("vipul");
		stringList.add("tejal");
		stringList.add("anusha");
		stringList.add("sameeksha");
		stringList.add("surya");
		
		System.out.println("Before sorting " + stringList);
		
		Collections.sort(stringList);
		Collections.reverse(stringList);
		//System.out.println("After reversing " + integerList);
		
		System.out.println("First maximum " + stringList.get(0));
		System.out.println("Second maximum " + stringList.get(1));
		System.out.println("Third maximum " + stringList.get(2));
	}
	
}