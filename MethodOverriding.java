package classes;

class animal{
	void run() {
		System.out.println("Animal makes sound!");
	}
	void eat() {
		System.out.println("Animal Eats!");
	}
}
class dog extends animal{
	void run() {
		System.out.println("Dog Barks!");
	}
	void eats() {
		System.out.println("Dog Eats!");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog obj = new dog();
		obj.run();
		obj.eat();
		obj.eats();
	}

}
