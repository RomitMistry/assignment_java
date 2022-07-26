
public class DIV {
public static void main(String[] args) {
		
		
		System.out.println(" numbers which are Divisible by 3");
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n\n numbers which are Divisible by 5");
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n\n numbers which are divisible by 3 and 5");
		for(int i=0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
