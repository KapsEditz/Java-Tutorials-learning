package hello;

public class implicitexplict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Here are the types of Type Casting : - ");
		int mineInt = 2;
		double mineDouble;
		mineDouble = mineInt;
		System.out.println("Implicit Type Casting [ int to double ] : " + mineDouble);
		//Above is an example of Implicit TypeCasting
		
		
		double myDouble = 9.78;
		int myInt = (int) myDouble;
		System.out.println("Explicit Type Casting [ double to int ] : " + myInt);
		//Above is an example of Explicit TypeCasting
		
		System.out.println("\nBelow are the conversion of datatypes into wrapper class : ");
		int a = 10;
		Integer b = a;  
		System.out.println(b + "     Size is INCREASED here of the variable.");
		//Capital datatypes are known as Wrapper Class
		//in this, size of variable increases (this process is called as Auto-Boxing)
		
		Double d = 9.99; 
		double e=d;
		System.out.println(e + "   Size is DECREASED here of the variable");
		//In this, size of variable decreases (this process is called as Auto-Unboxing)
		
		boolean flag = true;
		Boolean f = flag;
		System.out.println("Here is an example of boolean - " + f);
		
		
	    String myStr = "Hello";
	    String myStr1 = "Helloo";
	    System.out.println("\nString is '" + myStr + "'");
	    System.out.println("Below are Methods of String - ");
	    
	    char result = myStr.charAt(0);
	    System.out.println("1. charAt( 0 'position') method - " + result);
	    
	    int r1 = myStr.codePointAt(0);
	    System.out.println("2. codePointAt( 0 'position') method - " + r1 + "\n   [Returns ASCII Code]");
	    
	    int r2 = myStr.codePointBefore(1);
	    System.out.println("3. codePointBefore( 1 'position') method - " + r2 + "\n   [Returns ASCII Code of 1 character before of the position]");
	    
	    int r3 = myStr.compareTo(myStr1);
	    System.out.println("4. myStr.compareTo(myStr1) method - " + r3 + "\n   [Returns Difference between two string in numeric format]");
	    
	    String r4 = myStr.concat(myStr1);
	    System.out.println("5. myStr.concat(myStr1) method - " + r4 + "\n   [Returns Combination of 2 Strings]");
	    
	    boolean r5 = myStr.contains("Hel");
	    System.out.println("6. myStr.contains(Hel) 'the text needed to be confirmed in bracket' method - " + r5 + "\n   [Returns True or False]");
	    
	    boolean r6 = myStr.contentEquals("Hello");
	    System.out.println("7. myStr.contentEquals('Hello') method - " + r6 + "\n   [Returns True/False if the String is exactly equal or not]");
	    
	    String myStr2 = "HELLO";
	    String myStr3 = "hello";
	    int r7 = myStr2.compareToIgnoreCase(myStr3);
	    System.out.println("8. myStr.compareToIgnoreCase(myString) method - " + r7 + "\n   [Returns Numerical difference between 2 strings while Ignoring cases]");
	    
	    char[] string0 = {'H','E','L','L','O'};
	    String string1 = "";
	    string1 = String.copyValueOf(string0, 0, 5);
	    System.out.println("9. str1.copyValueOf(str0, 0, 5) method - " + string1 + "\n   [Returns exact set of characters as a String]");
	
	    boolean r8 = myStr.endsWith("llo");
	    System.out.println("10. myStr.endsWith('llo' eg) method - " + r8 + "\n   [Returns True/False if the given set of characters end with the given String]");

	
	}
}

