package interfacedemo1;

interface teacher {
	
	void subject();
	void passpercentage();

}
class school implements teacher {

public void subject() {
	System.out.println("Subject: Maths");
}

public void passpercentage() {
	System.out.println("Passpercentage: 80%");
}

public void result() {
	System.out.println("Result: 100%");
}



public static void main(String[] args) {
	
	school ss = new school();
	ss.passpercentage();
	ss.subject();
	ss.result();
	
	
}

}

