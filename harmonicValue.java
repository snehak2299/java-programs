package com.javabasicprograms;

import java.util.Scanner;

public class harmonicValue {

	public static void main(String[] args) {
		double NthNumber,i ;
		double harmonicValue =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Nth number to find harmonic value");
		NthNumber = scanner.nextDouble();
		for(i=1;i<=NthNumber;i++) {
			harmonicValue =harmonicValue +(1/i);
			
		}
		System.out.println("harmoic value is:"+harmonicValue);

	}

}
