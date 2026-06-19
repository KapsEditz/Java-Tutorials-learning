package a1906;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		boolean b = true;
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				b = false;
				break;
			}
		}
		
		if(b == true) {			
		System.out.println("Prime True!");
		}
		else {
			System.out.println("No Prime no!");
		}
		
		
	}
}
