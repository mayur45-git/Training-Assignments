package com.yash.collection.Task_6;

import java.util.Map;
import java.util.TreeMap;

public class HashMap {
	
static Map<String,Integer> map=new java.util.HashMap<>();
	
	public static void sortedByKey() {
		
		System.out.println("After sorting: ");
		TreeMap<String,Integer> sorted=new TreeMap<>(map);
		for(Map.Entry<String,Integer> entry:sorted.entrySet()) {
			
			System.out.println("Key= "+entry.getKey()+", "+"Value= "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map.put("Eren", 700000);
		map.put("Mikasa", 90000);
		map.put("Armin", 4000);
		
		System.out.println("Before sorting: "+map);
		sortedByKey();
		
		
	}
		
	

}
