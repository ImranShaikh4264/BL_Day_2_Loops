package com.bridgelab.day2.loops;

import java.util.Scanner;

public class ReverseIntegerFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		int Integer = sc.nextInt(); 
		int reverse = 0;
		System.out.println("Given Integer is : " + Integer);
		for (; Integer != 0; Integer = Integer / 10) {
			int remainder = Integer % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given Integer is: " + reverse);
	}

}
