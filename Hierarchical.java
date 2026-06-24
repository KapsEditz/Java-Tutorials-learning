package inheritance;

class zeroo {
	void zero() {
		System.out.println("ZEROOO");
	}
}

class one extends zeroo{
	void onee() {
		System.out.println("WASSUP 1");
	}
}

class two extends zeroo{
	void twoo() {
		System.out.println("WASSUP 2");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one obj1 = new one();
		two obj2 = new two();
		
		obj1.onee();
		obj1.zero();
		obj2.twoo();
		obj2.zero();
	}

}
