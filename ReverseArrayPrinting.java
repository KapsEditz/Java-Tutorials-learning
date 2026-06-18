package array;

public class ReverseArrayPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for(int i = arr.length - 1 ; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		int[] arr1 = {1 , 3 , -2 , 0 , -6 , 7};
		for(int j = 0; j <= arr1.length; j++) {
			if(arr1[j] > 0) {
				System.out.println("Positive - " + arr1[j]);
			}
			if(arr[j] < 0) {
				System.out.println("L Negative Numbers");
			}
			if(arr[j] == 0) {
				System.out.println("0 Finally");
			}
			System.out.println(j);
		}
		
		
	}
}
