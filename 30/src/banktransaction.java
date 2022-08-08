
public class banktransaction {
public static void main(String[] args) {
	try {
		int amount = 2500;
		if(amount>2000) throw new ArithmeticException("Sorry, insufficient balance, you need more 500 Rs. To perform this transaction");
		
		else
			System.out.println("succesfully withdrawn");
		
	} catch (ArithmeticException e) {
		System.out.println(e);
	}
}
}
