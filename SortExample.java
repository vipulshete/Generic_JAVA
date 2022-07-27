package com.bridege.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		
		sortIntegerList();
	}
	
	private static void sortIntegerList() {
		List<Double> integerList = new ArrayList<>();
		
		integerList.add(35.31);
		integerList.add(67.22);
		integerList.add(12.25);
		integerList.add(17.25);
		integerList.add(9.14);
		integerList.add(88.41);
		
		System.out.println("Before sorting " + integerList);
		
		Collections.sort(integerList);
		Collections.reverse(integerList);
		//System.out.println("After reversing " + integerList);
		
		System.out.println("First maximum " + integerList.get(0));
		System.out.println("Second maximum " + integerList.get(1));
		System.out.println("Third maximum " + integerList.get(2));
	}
	
}