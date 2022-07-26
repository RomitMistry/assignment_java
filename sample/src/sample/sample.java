package sample;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		int n= 0 ,i, s=0;
		double avg;
		{	
		System.out.println("input 5 numbers");
		}
		
			for(i=0;i<5;i++)
			{
				Scanner sc = new Scanner (System.in);
				 n = sc.nextInt();
				 s +=n;
				    
		}
	
	  System.out.println("sum of all are:: "+n);
	  
	  avg = s/5 ;
	  System.out.println( "the average is "+avg);
	}

}
