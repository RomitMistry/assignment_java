import java.util.Scanner;

public class alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("enter a year");
	    int year = sc.nextInt();
	    
	    if (year % 4==0) {
	    	System.out.println("this is a leap year");
	    }
	    else {
	    	System.out.println("this is not a leap year");
	    }
	}

}
