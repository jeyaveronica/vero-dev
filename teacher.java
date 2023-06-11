package abstactdemo1;

abstract class teacher {
	
    abstract void student();
	public void holiday() {
		System.out.println(" One week holiday");
	
}
}

class head extends teacher {
	public void student() {
		System.out.println(" All the best students");
	}
}

class school {

	public static void main(String[] args) {
		head myschool = new head();
		myschool.student();
		myschool.holiday();
		
		
	}

}

// if one method is abstract, entire class is abstract. So, mention as "abstract class"