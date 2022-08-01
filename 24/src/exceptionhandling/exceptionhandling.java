package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
class Divide{
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner obj  = new Scanner(System.in);
	    System.out.println("Enter a  = ");
	    int a = obj.nextInt();
	    
	    System.out.println("Enter b = ");
	    int b = obj.nextInt();
	    
	    int c = a/b;
	    System.out.println(c);
	}
}

public class exceptionhandling {
public static void main(String[] args) throws ArithmeticException, InputMismatchException {
	try {
		Divide  d= new Divide();
		d.division();
	} catch (ArithmeticException e) {
		System.out.println("cannot be zero");
	}
	catch(InputMismatchException e) {
		System.out.println("cannot be string value");
	}
	
		int a, b, c;
	try {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a = ");
		a = obj.nextInt();
		System.out.println("enter b = ");
		b = obj.nextInt();
		c = a / b;
		System.out.println(c);
		System.exit(0);
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("this will exeucutes everytime");
}
}
}
