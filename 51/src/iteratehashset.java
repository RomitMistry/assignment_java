import java.util.HashSet;
import java.util.Iterator;
public class iteratehashset {
public static void main(String[] args) {
	HashSet<String> h_set = new HashSet<String>();
	h_set.add("yellow");
	h_set.add("black");
	h_set.add("green");
	h_set.add("blue");
	h_set.add("grey");
	System.out.println(h_set);
	Iterator itr = h_set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
