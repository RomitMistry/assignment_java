package naturalnumbers;

import java.util.Scanner;

public class numbers {
public static void main(String[] args) {

	int i=0,s=0,n=0;
			double avg;
			{
				System.out.println("write 5 numbers");
			}
			for(i=0;i<5;i++)
			{
				 Scanner in = new Scanner(System.in);
				    n = in.nextInt();	
				   s +=n;
			}
			avg=s/5;
			System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
		 
			}
}