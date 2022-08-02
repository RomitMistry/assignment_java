abstract class shape{
	abstract public void rectanglearea(int length,int breadth);
	abstract public void squarearea(int square);
	abstract public void circlearea(int circle);
}
class area extends shape {

	@Override
	public void rectanglearea(int length, int breadth) {
	System.out.println("area of rectangle :: "+(length*breadth));
		
	}

	@Override
	public void squarearea(int square) {
		// TODO Auto-generated method stub
		System.out.println("area of square :: "+(square*square));	
	}

	@Override
	public void circlearea(int circle) {
		// TODO Auto-generated method stub
		System.out.println("Area of circle :: "+(3.14159*circle*circle));
	}

	
}


public class MATHS {
public static void main(String[] args) {
	area c = new area();
	c.rectanglearea(3, 4);
	c.squarearea(3);
	c.circlearea(4);
	
	
}
}
