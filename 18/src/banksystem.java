abstract class bank {
	 abstract int getbalance(); 
	
}
class A extends bank{

	@Override
	int getbalance() {
		System.out.println("SO BANK A HAS DEPOSITED $100");
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class B  extends bank{

	@Override
	int getbalance() {
		System.out.println("SO BANK B HAS DEPOSITED $150");
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class C  extends bank{

	@Override
	int getbalance() {
		System.out.println("SO BANK C HAS DEPOSITED $200");
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class banksystem {
public static void main(String[] args) {
	A a  = new A();
	B b =  new B();
	C c =  new C();
	a.getbalance();
	b.getbalance();
	c.getbalance();
	
	
}
}
