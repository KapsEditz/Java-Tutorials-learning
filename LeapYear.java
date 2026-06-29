package LeapYear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter any Year - ");
		int year = myObj.nextInt();
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("Year " + year + " is Leap Year!");
		}
		else {
			System.out.println("Year " + year + " is Not a Leap Year!");
		}
		myObj.close();
	}
}
