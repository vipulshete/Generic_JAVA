package com.bridege.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		
		sortIntegerList();
	}
	
	private static void sortIntegerList() {
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(35);
		integerList.add(67);
		integerList.add(12);
		integerList.add(17);
		integerList.add(9);
		integerList.add(88);
		
		System.out.println("Before sorting " + integerList);
		
		Collections.sort(integerList);
		Collections.reverse(integerList);
		//System.out.println("After reversing " + integerList);
		
		System.out.println("First maximum " + integerList.get(0));
		System.out.println("Second maximum " + integerList.get(1));
		System.out.println("Third maximum " + integerList.get(2));
	}
	
}