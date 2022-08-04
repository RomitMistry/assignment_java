import java.util.ArrayList;
import java.util.Iterator;
public class insertelement {
public static void main(String[] args) {
	ArrayList array = new ArrayList();
	array.add("red");
	array.add("pink");
	array.add("blue");
	array.add("yellow");
	array.add("black");
	System.out.println(array);
	array.add(0, "grey");
	Iterator itr = array.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
}
}
}