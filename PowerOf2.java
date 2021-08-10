package com.javabasicprograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Nth power of base 2");
		int NthPower = sc.nextInt();
		int baseNumb = 2;
		if(31>NthPower) {
			System.out.println(Math.pow(baseNumb,NthPower));
		}
		

	}

}
