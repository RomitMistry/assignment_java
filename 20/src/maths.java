import java.util.Scanner;

public class maths {
public static void main(String[] args) {
          
          int i,fact=1;  
	  
		System.out.println("enter a number:: ");
		  Scanner sc = new Scanner(System.in);
		  int number11 = sc.nextInt();
		  for(i=1;i<=number11;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number11+" is: "+fact);    
		 }  
		}  


