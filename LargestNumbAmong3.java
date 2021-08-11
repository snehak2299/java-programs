package com.javabasicprograms;

import java.util.Scanner;

public class LargestNumbAmong3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNumb = sc.nextInt();
		System.out.println("enter second number");
		int secondNumb = sc.nextInt();
		System.out.println("enter third number");
		int thirdNumb = sc.nextInt();
		if((firstNumb>secondNumb)&&(firstNumb>thirdNumb)) {
			System.out.println("biggest number is"+"  "+firstNumb);
		}
		else if((secondNumb>firstNumb)&&(secondNumb>thirdNumb)) {
			System.out.println("biggest number is"+"  "+secondNumb);
		}
		else {
			System.out.println("biggest number is:"+"  "+thirdNumb);
		}

	}

}
