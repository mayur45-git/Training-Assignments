package com.yash.collection.Task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesDescending {
	
public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(3);
		
		
		System.out.println("Before removal of duplicate integer: "+list);
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println("After removal of duplicate integer: ");
		Set<Integer> s1=new LinkedHashSet<>(list);
	
		for(Integer i:s1) {
		
		System.out.println(i);	
			
		}
	}

}
