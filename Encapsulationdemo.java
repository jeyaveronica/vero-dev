package encapsulationdemo;

public class Encapsulationdemo {
	
	public static void main(String[] args) {
		
	studentdetails sd = new studentdetails();
	sd.setStudentname("AAA");
	sd.setAge(8);
	sd.setRank(3);
	System.out.println("Student Name: " +sd.getStudentname());
	System.out.println("Student Age: " +sd.getAge());
	System.out.println("Student Rank: " +sd.getRank());
	
		
	}

}


/*
 * function Animal(name, numLegs) { this.name = name; this.numLegs = numLegs; }
 * 
 * name is a local function argument to Animal. It won't be accessible anywhere
 * outside that function. If you want sayName to have access to that value, it
 * needs to be stored someplace that is shared between both functions → this
 */
