package my_package1;
import java.util.Scanner;
public class assignment_7 {
	public static void main(String[] args) {
		try (Scanner inpt = new Scanner(System.in)) {
        	System.out.println("enter number");
			int wcd=inpt.nextInt();
			if(wcd<=45) {
				System.out.println("No tax");
			}else if(wcd<75&&wcd>45) {
				System.out.println("tax:475");
			}else if(wcd<125&&wcd>75){
				System.out.println("tax:750");
			}
			else if(wcd<200&&wcd>125) {
				System.out.println("tax:1225");
			}else if(wcd<350&&wcd>200) {
				System.out.println("tax:1650");
			}
			else {
				System.out.println("tax:2000");
			}

		}

	}
}
