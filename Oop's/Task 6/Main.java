package com.yash.oops.Task_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Find maximum of 3 ,4 or 5 for n number");

		int n = sc.nextInt();

		if (n == 3) {

			System.out.println("Enter 3 digit number");

			int number = sc.nextInt();

			B class1 = new B();

			class1.getNumbers(number);
		}

		if (n == 4) {

			System.out.println("Enter 4 digit number");

			int number = sc.nextInt();

			C class2 = new C();

			class2.getNumbers(number);
		}

		if (n == 5) {

			System.out.println("Enter the number");

			int number = sc.nextInt();

			D class3 = new D();

			class3.getNumbers(number);
		}

	}

}
