package com.javabasicprograms;

import java.util.Scanner;

public class quotientRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter dividend");
		int dividend = scanner.nextInt();
		System.out.println("enter divisor");
		int divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("quotient is:"+ quotient);
        System.out.println("remainder is:"+remainder);

	}

}
