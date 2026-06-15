package assign2;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("\nQ.1) Print numbers from 1-10 - ");
		int i=0;
		do {
			System.out.print(" " + i);
			i++;
		}
		while(i<=10);
		
		
		System.out.println("\n\n\nQ.2) Write code to check employee bonus eligibility and add bonus of 1000 to their salary");
		System.out.println("Conditions - 1. Experience greater than 5 years   2.Salary less than 50k");
		System.out.println("Enter your name - ");
		String str1 = myObj.nextLine();
		System.out.println("Enter your Salary - ");
		int sal = myObj.nextInt();
		System.out.println("Enter your Experience (in years) - ");
		int exp = myObj.nextInt();

		if(exp>=5 && sal<=50000) {
			System.out.println(str1 + " is Eligible for Bonus!");
			sal = sal + 1000;
			System.out.println("Updated salary - " + sal);
		}
		else {
			System.out.println(str1 + " is Not eligible for Bonus!");
		}
		
		
		System.out.println("\n\nQ.3) Find Greater number amoung 3");
		System.out.println("Enter your first number - ");
		int a = myObj.nextInt();
		System.out.println("Enter your second number - ");
		int b = myObj.nextInt();
		System.out.println("Enter your third number - ");
		int c = myObj.nextInt();
		if(a>b && a>c) {
			System.out.println("\nA is Greatest (" + a + ")");
		}
		else if(b>c){
			System.out.println("\nB is Greatest (" + b + ")");
		}
		else {
			System.out.println("\nC is Greatest (" + c + ")");
		}
		
		myObj.close();
	}
}
