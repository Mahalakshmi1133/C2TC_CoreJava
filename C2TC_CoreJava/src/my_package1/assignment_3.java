package my_package1;
import java.util.Scanner;
public class assignment_3 {
	public static void main(String[] args){
			try(Scanner inpt=new Scanner(System.in)){
			System.out.println("enter the number");
			
			int n=inpt.nextInt();
			if(n%3==0) {
				System.out.println(n+ " multiple of 3 ");
			}
				
		else {
				System.out.println(n+ " not multiple of 3 ");
			}

	}
	
}
}
