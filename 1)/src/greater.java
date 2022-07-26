import java.util.Scanner;

public class greater {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("write a number");
		int num1 = sc.nextInt();
		
		System.out.println("write a number");
		int num2 = sc.nextInt();
		
		System.out.println("write a number");
		int num3 = sc.nextInt();
		
		 if(num1>num2)
			 if(num1>num3)
				 System.out.println("GREATEST NUMBER IS :: "+num1);
		 
		 if(num2>num1)
			 if(num2>num3)
				 System.out.println("GREATEST NUMBER IS :: "+num2);
		 
		 if(num3>num1)
			 if(num3>num2)
				 System.out.println("GREATEST NUMBER IS :: "+num3);
	}

}
