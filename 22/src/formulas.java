class shape{
	public void methodshape() {
		System.out.println("this is Shape");
	}
}

class rectangle extends shape{
	public void mehtodrectangle() {
		System.out.println("this is rectangular shape");
	}
}
class circle extends shape{
	public void methodcircle() {
		System.out.println("this is circle shape");
	}
}
class square extends rectangle{
	public void methodsquare() {
		System.out.println("square is a rectangle");
	}
}

public class formulas {
public static void main(String[] args) {
 square s = new square();
 s.methodshape();
 s.mehtodrectangle();
	
}
}
