package operator;

public class Operator1 {
	
	static void myMethod() {
		System.out.println("\nHELLO, I'm myMethod()");
	}
	
	int add(int a, int b) {
		System.out.println("First number is " + a );
		System.out.println("Second number is " + b );
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operator1 str = new Operator1();
		System.out.println("Addition of Numbers - " + str.add(10, 30));
		myMethod();
	}

}
