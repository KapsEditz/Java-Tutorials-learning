package com.demo;

public class UseOfOperators {

	public static void main(String[] args) {
		
		int a,b;
		a=20;
		b=10;

		System.out.println("Value of A : " + a );
		System.out.println("Value of B : " + b );
		
		System.out.println("\nAddition of Two no - " + (a+b) );
		System.out.println("Substraction of Two no - " + (a-b) );
		System.out.println("Multiplication of Two no - " + (a*b) );
		System.out.println("Division of Two no - " + (a/b) );
		System.out.println("Modulas of Two no - " + (a%b) );

		int z=3;
		z++;
		System.out.println("\nOriginal value is 3 and now by using '++' operator value becomes " + z);
		z=3;
		z--;
		System.out.println("Original value is 3 and now by using '--' operator value becomes " + z);
		
		final int bdate = 10;
		System.out.println("\nBirth Date is " + bdate + "th June of my buddy");
	}

}
