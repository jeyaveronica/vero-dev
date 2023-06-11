package polymorphismdemo;
 // runtime polymorphism-method override

	class teacher 
	{
		public void subject()
		{		
			System.out.println("Subject: Maths");
		} 
	}
	
	class student extends teacher 
	{
		public void subject()
		{		
			System.out.println("Passpercentage: 80%");
		} 
	}
	

	public class polymorphismmethodoverride {
		
	public static void main(String[] args) {
		
		student stu = new student();
		stu.subject();
		teacher tea = new teacher();
		tea.subject();
	}
		

	}


