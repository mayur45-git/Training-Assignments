package com.yash.collection.Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesAscending {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(55);
		list.add(45);
		list.add(50);
		list.add(68);

		Collections.sort(list);
		System.out.println("Before remove duplicate: "+list);
		
		Set<Integer> duplicate= new TreeSet<>(list);
		System.out.println("After duplicate remove: ");
		for(int num:duplicate) {
			System.out.println(num);
		}
	}

}
