package com.yash.collection.Task_10;

public class Main {
	
	public static void main(String[] args) 
	{
		 int arr[] = { 1, 2, 3, 2, 5, 4, 4 };
		 
		
		 int n = arr.length;
		 
		 A a = null;
		 for (int i = 0; i < n; i++)
		 {
		 a = Binarylass.insert(a,arr[i]);
		 }
		 Binarylass.inOrder(a);
		 }
	
	

}
