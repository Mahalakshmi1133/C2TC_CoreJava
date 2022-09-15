package my_package1;
import java.util.Scanner;
public class assignmnet_9 {
	public static void main(String[] args) {
		     int negatives=1;
		      int  num [] = {1,2,3,4,5,6,7,-8,-9,12};

		      for(int i=0;i<num.length;i++)
		         {
		               if (num[i]<0)
		               {
		                  negatives*=num[i];
		               }
		               
		         }

		         System.out.println("The product of negatives is " + negatives);
		        
		      }
	}

