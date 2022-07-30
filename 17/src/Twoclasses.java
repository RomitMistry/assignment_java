 abstract class parent{
	  void message() {
		  
	  }
 }
	 class subclass1 extends parent{
		void message() {
			System.out.println("this is a parent class");
		}
	 }
	 class subclass2 extends parent{
		 void message() {
			 System.out.println("this is a child class");
		 }
	 }
public class Twoclasses {
	public static void main(String[] args) {
 
		subclass1 obj1 = new subclass1();
		subclass2 obj2 = new subclass2();
           
		obj1.message();
		obj2.message();
		
		
		
	}

}
