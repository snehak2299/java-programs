package com.javabasicprograms;

import java.util.Scanner;

public class flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many times you want to flip coin");
		int NoOfFlips = scanner.nextInt();
		int heads = 0;
		int tails = 0;
		
		for(int i =0; i < NoOfFlips;i++) {
			double randomNumber = Math.random();
			if(randomNumber<0.5) {
				heads++;
			}
			else {
				tails++;
			}
		}
		
		double PercentHead = (heads*100.0)/NoOfFlips;
		double PercentTail = (tails*100.0)/NoOfFlips;
		System.out.println("percentage of total heads:"+PercentHead);
		System.out.println("percentage of total tails:"+PercentTail);

	}

}
