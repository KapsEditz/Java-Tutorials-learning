package exception;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = { 1, 2, 3};
		try {
			System.out.println(numbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught! - " + e);
		}
		finally {
			System.out.println("This block always executes!");
		}
		System.out.println("Remaining program Continues...");

	
		for(int i=0; i<=1000; i++)
		{
			System.out.println("Fuh u x" + i);
		}
		
		sc.close();
	}

}

