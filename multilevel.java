package inheritance;

class Animal{
	void sound() {
		System.out.println("Animal Makes Sound!");
	}
}

class Dog extends Animal{
	void growls() {
		System.out.println("Dog Growls!");
	}
}

class Puppy extends Dog{
	void barks() {
		System.out.println("Puppy Barks!");
	}
}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy p = new Puppy();
		p.sound();
		p.growls();
		p.barks();
	}

}
