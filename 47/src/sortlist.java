import java.util.ArrayList;
import java.util.Collections;

public class sortlist {
public static void main(String[] args) {
	ArrayList<String> array = new ArrayList<>();
	   array.add("blue");
	   array.add("black");
	   array.add("yellow");
	   array.add("grey");
	   array.add("white");
	   System.out.println("before sorting::"+array);
	   Collections.sort(array);
	   System.out.println("after sorting::"+array);
}
}
