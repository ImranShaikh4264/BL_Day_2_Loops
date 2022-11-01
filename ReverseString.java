package com.bridgelab.day2.loops;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter string");
	String string = sc.nextLine();
String reversedStr = "";
for(int i = string.length()-1; i >= 0; i--){  
	 reversedStr = reversedStr + string.charAt(i);    
}      System.out.println("Original string: " + string);   
System.out.println("Reverse of given string: " + reversedStr);    
}
}
