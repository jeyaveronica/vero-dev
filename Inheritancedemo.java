package inheritancedemo;


class Teacher {
	
	void subject() {
		System.out.println(" Teacher teaches subject");
	}
}

class Student extends Teacher {
	
		void listen() {
		System.out.println(" Student listens to the subject");
	}
}
public class Inheritancedemo {
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.listen();
		stu.subject();
	}

}
