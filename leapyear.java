package com.javabasicprograms;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter year to check leap year");
		int year = scanner.nextInt();
		if(year>999 && year<10000) {
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				System.out.println("leap year");
			}
			else {
				System.out.println("not leap year");
			}
				
		}
		else {
			System.out.println("enter valid year");
		}

	}

}
