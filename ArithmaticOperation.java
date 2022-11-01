package com.bridgelab.day2.loops;

public class ArithmaticOperation {
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		int c = 20;
		int oper1, oper2, oper3, oper4;
		oper1 = a + b * c;
		oper2 = c + a / b;
		oper3 = a % b + c;
		oper4 = a * b + c;
		System.out.println("(i) a+b*c =" +oper1);
		System.out.println("(ii) c+a/b =" +oper2);
		System.out.println("(iii) a%b+c =" +oper3);
		System.out.println("(iv) a*b+c =" +oper4);

		
	}

}
