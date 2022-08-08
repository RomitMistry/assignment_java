import java.security.PublicKey;
import java.util.Scanner;

public class vote {
public static void main(String[] args) {
	
	try {
		
		  int age =16;
			if(age<18)
			throw new ArithmeticException("Invalid Age cannot cast vote");

        else

              System.out.println("Welcome To The Group Of Votes");

		
	} catch (ArithmeticException e) {
		 System.out.println(e);	
	}
}
}
