import java.util.ArrayList;

public class updateelement {
public static void main(String[] args) {
	   ArrayList<String> array = new ArrayList<>();
	   array.add("blue");
	   array.add("black");
	   array.add("yellow");
	   array.add("grey");
	   array.add("white");
	   System.out.println(array);
	   array.set(2, "orange");
	   System.out.println(array);
}
}
