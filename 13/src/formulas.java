class Rectangle {
	int length;
	int breadth;
	
	public void  areaofrectangle(int length ,int breadth) {
		this.breadth=breadth;
		this.length=length;
		System.out.println("area of rectangle is ::"+(length*breadth));
	}
	public void parameterofrectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		System.out.println("parameter of rectangke is::"+(2*length+breadth));
	}
}
	

class Square extends Rectangle {
	double side;
	
	public void areaofsquare(double side) {
		this.side=side;
		this.side=side;
		System.out.println("Area of square is:: "+(side*side));
}
	public void parameterofsquare(double side) {
		this.side=side;
		this.side=side;
		System.out.println("parameter of square is:: "+(4*side));
}
}


public class formulas {
	public static void main(String[] args) {
		
		
		Square S = new Square();
		S.areaofrectangle(3, 2);
		S.parameterofrectangle(43, 23);
		S.areaofsquare(9);
		S.parameterofsquare(20);
	
	}

}
