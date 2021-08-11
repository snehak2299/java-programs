package com.javabasicprograms;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no to check its even or odd");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("number is even number");
		}
		else {
			System.out.println("number is odd number");
		}

	}

}
