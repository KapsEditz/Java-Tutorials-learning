package inheritance;

interface Father{
	void house();
}

interface Mother{
	void jewelry();
}

class child implements Father, Mother{
	
	public void house() {
		System.out.println("House from Father!");
	}
	public void jewelry() {
		System.out.println("Jewelry from Mother!");
	}
	
}

public class Interfacee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c = new child();
		c.house();
		c.jewelry();
		
	}

}



