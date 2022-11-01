package com.bridgelab.day2.loops;

public class SumNaturalWhile {
public static void main(String[] args) {
	int number = 10;
	int sum = 0;
	int i=1;
	while(i<=number) {
		sum = sum + i;
		i++;	
	}
	System.out.println("sum of " +number+"  natural number  is " + sum );
}
}
