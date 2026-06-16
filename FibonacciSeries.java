package fibonacciSeries;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0, second = 1;
		System.out.print("Fibonacci Series: ");
		for(int i = 1; i <= 15; i++) {
			System.out.print(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
		}
	}

}
