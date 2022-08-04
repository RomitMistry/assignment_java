import java.util.ArrayList;
import java.util.Collections;

public class swap {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("yellow");
	list.add("green");
	System.out.println(list);
	Collections.swap(list, 0, 1);
	
	System.out.println("After swaping :: "+list);
}
}
