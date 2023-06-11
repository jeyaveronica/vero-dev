package examplebreak;

public class examplebreakstatement {

	public static void main(String[] args) {

	          
	    
	    for (int i = 50; i >=0; i-=10) {	      
	     
	      if (i == 30) {
	    	    break;	
	      }
	      
	      System.out.println(i);
	      }
	    
	}
	}


// 50==30, no. so, line 15 is executed. 40==30, no. so, line 15 is executed. 
// 30==30, yes. Line 12 is executed and come out of the loop.