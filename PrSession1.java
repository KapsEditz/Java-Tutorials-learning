package practice;

public class PrSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 10, -2, 30, 0, 9, -5};
		int l = arr[0];
		int s = arr[0];
		int sum = 0;
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( l < arr[i] ) {
				l = arr[i];				
			}
		}
		System.out.println("Largest Amoung the Array - " + l );
		
		for(int i = 0; i < arr.length; i++) {
			if( s > arr[i] ) {
				s = arr[i];
			}
		}
		System.out.println("Smallest Amoung the Array - " + s);
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all array - " + sum );
		
		int average = 0;
		average = sum / arr.length;
		System.out.println("Average of Array - " + average);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				pos++;
			}
			else if(arr[i] < 0) {
				neg++;
			}
			else {
				zero++;
			}
		}
		
		System.out.println("Positive Numbers in an Array - " + pos);
		System.out.println("Negative Numbers in an Array - " + neg);
		System.out.println("Zero in an Array - " + zero);
		
	}

}
