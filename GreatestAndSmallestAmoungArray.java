package array;

public class GreatestAndSmallestAmoungArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 20, 40, 90, 60};
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest = " + max);
		
		int min = arr[0];
		for(int j = 1; j < arr.length; j++) {
			if( arr[j] < min ) {
				min = arr[j];
			}
		}
		System.out.println("Smallest = " + min);
		
	}
}
