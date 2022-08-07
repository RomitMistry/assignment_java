
public class tryandcatch {
	public static void main(String[] args) {
		try {
			int[] a = new int [5];
			 a[5]=30/0;    
	         System.out.println(a[5]);  
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception occurs");
		}
	}
}
