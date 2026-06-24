package inheritance;

class animal{
	void sound() {
		System.out.println("Animal makes Sound!");
	}
}

class dog extends animal{
	void bark() {
		System.out.println("Dog Barks!");
	}
}


public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		d.sound();
		d.bark();
	}

}
