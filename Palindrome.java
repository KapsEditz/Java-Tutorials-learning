package inheritance;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int original = a;
		int rev = 0;
		
		while(a>0) {
			int digit = a%10;
			rev = rev*10 + digit;
			a = a/10;
		}
		
		if (original == rev) {
			System.out.println("The Number is Palindrome!");
		}
		else {
			System.out.println("The Number is not Palindrome!");
		}
		
		sc.close();
	}

}
