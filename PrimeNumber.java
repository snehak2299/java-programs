package com.logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check prime number");
		int number = sc.nextInt();
		if(number<=1) {
			System.out.println("not a prime number");
		}
		for (int i =2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				System.out.println("not a prime number");
			}
		}
		System.out.println("prime number");
	}

}
