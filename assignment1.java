package hlo;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9, b=3;
		System.out.println("Q.1) A's value is 9 and B's value is 3");
		System.out.println("Addition of 2 numbers - " + (a+b));
		System.out.println("Subtraction of 2 numbers - " + (a-b));
		System.out.println("Multiplication of 2 numbers - " + (a*b));
		System.out.println("Division of 2 numbers - " + (a/b));
		System.out.println("Modulas of 2 numbers - " + (a%b));
		
		System.out.println("\nQ.2) String Operations");
		String str = "hello";
		System.out.println("String name - " + str);
		System.out.println("Length of string - " + str.length());
		System.out.println("Uppercase of given string - " + str.toUpperCase());
		System.out.println("Lowercase of given string - " + str.toLowerCase());
		System.out.println("Finding a Specific word in a string (he) - " + str.contains("hel"));
		System.out.println("After replacing 'hello' with 'hi' - " + str.replace("hello", "hi"));

		System.out.println("\nQ.3) Employee Details - ");
		String st1 = "Raghav Amkare";
		int empid = 120016;
		int salary = 50000;
		System.out.println("Employee Name - " + st1);
		System.out.println("Employee ID - " + empid);
		System.out.println("Salary - " + salary);
		System.out.println("Lenth of Employee name - " + st1.length());
		System.out.println("Name in Uppercase - " + st1.toUpperCase());
	
	}
}
