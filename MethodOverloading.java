package classes;

class one{
	int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		one obj = new one();
		System.out.println("Addition of two numbers - " + obj.add(10, 5) );	
		System.out.println("Addition of three numbers - " + obj.add(10, 20, 30));
	
	}
}
