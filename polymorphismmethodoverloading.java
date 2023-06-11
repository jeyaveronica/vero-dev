// polymorphism uses overloading(with and without parameters) and overriding methods. This program uses method overloading.
//compile time polymorphism-method overloading
package polymorphismdemo;

public class polymorphismmethodoverloading {
		
		
		public void display() {
			System.out.println("String is reversed" );
		}
		
		public void display(String a) {
			System.out.println("yes");
		}
			
		
		public static void main(String[] args)	{			
				
				polymorphismmethodoverloading d1 = new polymorphismmethodoverloading();
				d1.display();
				d1.display("a");
				
				}
		        			
				}
				




