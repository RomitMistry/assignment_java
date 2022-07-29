class formula{
	int length;
	int breadth;
	double side;
	
	void areaofrectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
		 System.out.println("Area of rectangle::"+(length*breadth));
		
	}
	void areaofsquare(double side) {
		this.side=side;
		this.side=side;
		System.out.println("Area of square::"+side*side);
	}
}
public class Formulas {
	public static void main(String[] args) {
		formula f = new formula();
		f.areaofrectangle(2, 4);
		f.areaofsquare(10);
		
	}

}
