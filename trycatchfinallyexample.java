package examplebreak;

public class trycatchfinallyexample {
	
	public static void main(String[] args) {
		
		
		int a=10, b=0;
		int c=0;
		
		try {
			c=a/b;
		}
		
		catch (Exception e) {
			System.out.println(" Error Occured");
		}
		
		finally {
			System.out.println(" The program has run with or without error");
		}
		System.out.println(" End");
		
	}

}


// object is thrown(c); object is received in catch e(object); exception is a class.