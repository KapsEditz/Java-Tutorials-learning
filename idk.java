package interfacee;

class idontknow implements idk1{

	public void animalsound() {
		System.out.println("Animal makes SOUND!");
	}

	public void move() {
		System.out.println("Animal MOVES!");
	}
	
}

class idontknow1 implements idk1{

	public void animalsound() {
		System.out.println("Dog makes SOUND!");
	}

	public void move() {
		System.out.println("Dog MOVES!");
	}
	
}

public class idk {

	public static void main(String[] args) {

		idontknow obj = new idontknow();
		obj.animalsound();
		obj.move();
		
		idontknow1 obj1 = new idontknow1();
		obj1.animalsound();
		obj1.move();
	}
}

