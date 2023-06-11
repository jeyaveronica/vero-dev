package tofindleapyear;

import java.util.Scanner;

public class Tofindleapyear {	

	
		   public static void main(String[] args){
	      int year;
	      System.out.println("Enter a Year: ");
	      Scanner object = new Scanner(System.in);
	      year = object.nextInt();
	      

	      if (year % 4 == 0) 
	         System.out.println("This year is a leap year");
	      else
	         System.out.println("This year is not a leap year");
	   }
	}


