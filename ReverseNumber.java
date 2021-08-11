package com.logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("write number to be reversed");
		int num = sc.nextInt();

	    
	    while(num != 0) {
	    
	      
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);

	}

}
