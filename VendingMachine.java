package com.logicalPrograms;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int total=0,i=1;
		int []notes = {1000,500,100,50,10,5,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total amount you want");
		int money = sc.nextInt();
		if(money==0)
		{
			System.out.println("you entered 0 amount"); ;
		}
		else
		{
			if(money>=notes[i])
			{
				for(i=0;i<notes.length;i++) {
					
					int calNotes =money/notes[i];
					int rem = money%notes[i];
					money =rem;
					total += calNotes;
					System.out.println(notes[i]+   " Notes   " +calNotes );
					
				}
			}
			//i++;
			System.out.println("total notes required:"+ total);
		}
		
			
			
		
		

	}

<<<<<<< HEAD
}
=======
}
>>>>>>> logicalprogram
