package com.bridgelab.day2.loops;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int Integer = sc.nextInt();
		int reverse = 0;
			int Integer1 = Integer;
		System.out.println("Given Integer is : " + Integer);
		for (; Integer != 0; Integer = Integer / 10) {
			int remainder = Integer % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given Integer is: " + reverse);
		if ( Integer1 == reverse) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is non palindrome");
		}
	}

}
