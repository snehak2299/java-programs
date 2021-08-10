package com.javabasicprograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find prime factor");
		int number = sc.nextInt();
		for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" "+"is the prime factors");
	            number = number/i;
	         }
		}
		if(number >2) {
	         System.out.println(number+" "+"is prime factor");
	    }

	}

}
