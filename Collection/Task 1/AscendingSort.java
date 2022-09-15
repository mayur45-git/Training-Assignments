package com.yash.collection.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingSort {

	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<>();
		l.add(3);
		l.add(2);
		l.add(6);
		l.add(7);
		l.add(1);
		l.add(4);
		l.add(25);
		System.out.println("List Before sorting"+ l);
		
		Collections.sort(l);
		
		System.out.println("List After sorting"+ l);
		
	

	}

}
