import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


class division{
	public void divide() throws ArithmeticException , InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter a number");
		int b = sc.nextInt();	
		 int c = a/b; 
		 System.out.println(c);
	}
}
public class divbycatch {
public static void main(String[] args) {
	try {
	division d =    new division  ();
	d.divide();
	}
	catch (ArithmeticException e) {

		System.out.println("cannot be zero");
	}
	catch (InputMismatchException e) {
		System.out.println("cannot be String value");
	}
	

	
}
}
