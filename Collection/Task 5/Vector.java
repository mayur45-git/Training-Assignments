package com.yash.collection.Task_5;

import java.util.Collections;

public class Vector {
	
	public static void main(String[] args) {
		
		java.util.Vector<String> vector=new java.util.Vector<>();
		vector.add("Eren");
		vector.add("Erwin");
		vector.add("Levi");
		
		System.out.println("Before sorting: "+vector);
		
		Collections.sort(vector);
		System.out.println("After sorting: ");
		for(String s:vector) {
			System.out.println(s);
		}
	}

}
