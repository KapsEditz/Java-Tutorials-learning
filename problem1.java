package a1906;

public class problem1 {
	static void sum() {
		int a[] = {1, 2, 3, 4, 5, 6, 7 ,8, 9};
		int b=0;
		for(int i = 0; i < a.length; i++) {
			b = b + a[i];
		}
		System.out.println("Sum of all Array elements - " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
	}
}
