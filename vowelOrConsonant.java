package com.javabasicprograms;

import java.util.Scanner;

public class vowelOrConsonant {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the alphabet");
			char alphabet = sc.next().charAt(0);
			switch(alphabet) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(alphabet+"  "+"is a vowel");
				break;
			default:
				System.out.println(alphabet+"  "+"is a consonant");
			}
			
	}

}
