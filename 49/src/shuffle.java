import java.util.ArrayList;
import java.util.Collections;

public class shuffle {
public static void main(String[] args) {

	ArrayList<String> array = new ArrayList<>();
	   array.add("blue");
	   array.add("black");
	   array.add("yellow");
	   array.add("grey");
	   array.add("white");
	   System.out.println(array);
	   Collections.shuffle(array);
	   System.out.println("after shuffle \n"+array);
}
}
