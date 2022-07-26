
public class javabasic {
public static void main(String[] args) {
	System.out.println("hello world");
	System.out.print("hello world agian");
	
	//addition//
	int a = 3, b= 4;
	System.out.println("value of a ="+a);
	System.out.println("value of b ="+b);
	
	System.out.println("addition of both a and b = "+(a+b));
	
	//user input program//
	Scanner sc = new Scanner(System.in);
	System.out.println("enter i = ");
	
	int j = sc.nextINT();
	System.out.println(j);
	
	char f = sc.nextchar();
	System.out.println(f);
} 
}