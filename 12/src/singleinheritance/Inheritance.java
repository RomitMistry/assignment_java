package singleinheritance;

class A{
	public void classA() {
		System.out.println("this is a parent class");
	}
}
class B extends A{
	public void classB() {
		System.out.println("this is a child class");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
		
		
	}

}
