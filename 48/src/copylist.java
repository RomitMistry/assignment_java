import java.util.ArrayList;
import java.util.Collections;
public class copylist {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<>();
	list1.add("blue");
	list1.add("black");
	list1.add("yellow");
	list1.add("grey");
	list1.add("white");
	System.out.println(list1);
	
	ArrayList<String> list2 = new ArrayList<>();
	list2.add("b");
	list2.add("a");
	list2.add("c");
	list2.add("d");
	list2.add("e");
	   System.out.println(list2);
	   Collections.copy(list1 , list2);
	   System.out.println("Copy List to List2,\nAfter copy:");
	   System.out.println("List1: " + list1);
	   System.out.println("List2: " + list2);
	  }
}

