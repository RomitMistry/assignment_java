import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class extract {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("yellow");
		list.add("green");
		list.add("black");
		list.add("blue");
		list.add("pink");
		System.out.println(list);
		List<String> sub_List =  list.subList(0, 2);
		System.out.println("List of first two elements::"+sub_List);
		
	}

}
