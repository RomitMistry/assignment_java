package numberdigit;

import java.util.Scanner;

public class numbers {
	public static void main(String[] args) {
		
			System.out.print("ENTER NUMBER :: ");
			try (Scanner sc = new Scanner(System.in)) {
				int a = sc.nextInt();
				int count =0;
				
				while(a!=0) {
					a=a/10;
					count++;
				}
				System.out.println("Count of digit is :" +count);
			}
			
			
		}
	}


