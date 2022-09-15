package my_package1;
import java.util.Scanner;
public class assignment_6 {
	public static void main(String[] args) {
			
	          try (Scanner inpt = new Scanner(System.in)) {
	        	System.out.println("enter number");
				int num =inpt.nextInt();
				  if(num>0) {
					  System.out.println("Number is positive" );
				  }
				  if(num<0) {
					  System.out.println("Number is negative");
				  }
				  else if(num==0){
					 System.out.println("Number is zero" );
					 }
			}
		
		}

	}

