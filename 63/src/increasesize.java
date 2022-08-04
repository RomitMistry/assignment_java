import java.util.ArrayList;


public class increasesize {
public static void main(String[] args) {

	   ArrayList<String> list = new ArrayList<String>(3);
	   list.add("green");
	   list.add("blue");
	   list.add("black");
	   list.add("white");
	   System.out.println("before adding :: "+list);
	   list.ensureCapacity(6);
	   list.add("A");
	   list.add("B");
	   list.add("C");
	   list.add("D");
	   System.out.println("After adding :: "+list);
}
}
