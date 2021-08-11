package com.logicalPrograms;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		long number,sum=0;
 	    Scanner sc=new Scanner(System.in);	   	 
        System.out.println("Enter a number to check its perfect number");
        number=sc.nextLong();
		int i=1;
		while(i<=number/2)
		{
		if(number%i==0)
		{
		sum+=i;
		}
		i++;
		}
		if(sum==number)
		{
		System.out.println(number+" is a perfect number");
		   } 
		else
		System.out.println(number+" is not a  perfect number"); 

	}

}