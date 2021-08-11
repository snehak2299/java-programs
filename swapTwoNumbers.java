package com.javabasicprograms;

import java.util.Scanner;

public class swapTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first no to swap");
		int firstNumb = scanner.nextInt();
		System.out.println("enter second no to swap");
		int secondNumb = scanner.nextInt();
		System.out.println("two number before swapping:"+firstNumb+"  "+secondNumb);
		int thirdNumb =  firstNumb;
		firstNumb = secondNumb ;
		secondNumb = thirdNumb;
		System.out.println("after swapping numbers are:"+firstNumb+"  "+secondNumb);
		

	}

}
