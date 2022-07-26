package abstraction;

abstract class RBI {
	abstract public void interest();
	abstract public void HL();
	public void reporate() {
		System.out.println("+-4%");
	}
}
class SBI extends RBI{
	public void interest() {
		System.out.println("sbi interest : 5%");
	}
	
	public void hl() {
		System.out.println("sbi loan : 7%");
	}
}

class PNB  extends RBI{
	public void interest() {
		System.out.println("pnb interest: 6%");
	}
	public void hl() {
		System.out.println("pnb loan:8%");
	}
}

public class abstraction{
	public static void main(String[] args) {
		SBI S = new sbi();
		s.
	}
}