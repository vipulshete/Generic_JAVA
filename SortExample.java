package com.bridege.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		
		sortStringList();
		sortFloatList();
		sortIntegerList();
	}
	
	private static void sortStringList() {
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("graphs");
		stringList.add("sitapal");
		stringList.add("kivi");
		
		System.out.println("Before sorting " + stringList);
		
		ListSorter<String>  listSorter = new ListSorter<String>(stringList);
		listSorter.maximum();
	}
	
	
	private static void sortFloatList() {
		List<Double> floatList = new ArrayList<>();
		
		floatList.add(35.31);
		floatList.add(67.22);
		floatList.add(12.25);
		floatList.add(17.25);
		floatList.add(9.14);
		floatList.add(88.41);
		
		System.out.println("Before sorting " + floatList);
		
		ListSorter<Double>  listSorter = new ListSorter<Double>(floatList);
		listSorter.maximum();
	
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
		
		ListSorter<Integer>  listSorter = new ListSorter<Integer>(integerList);
		listSorter.maximum();
		
	}
	
}

class ListSorter<T extends Comparable<? super T>> {
	
	private List<T> listToBeSorted;
	
	public ListSorter(List<T> listToBeSorted) {
		this.listToBeSorted = listToBeSorted;
	}
	
	public void maximum() {
		Collections.sort(listToBeSorted);
		
		Collections.reverse(listToBeSorted);
		System.out.println("After reversing  order" + listToBeSorted);
		
		System.out.println("First maximum " + listToBeSorted.get(0));
		System.out.println("Second maximum " + listToBeSorted.get(1));
		System.out.println("Third maximum " + listToBeSorted.get(2));
}	
}

