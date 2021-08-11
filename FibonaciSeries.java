package com.logicalPrograms;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		//int firstTerm = 0, secondTerm = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number till u want fibonaci series");
	    int n = sc.nextInt();
		int firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    
	    }

	}

}
