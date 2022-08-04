import java.util.ArrayList;
public class removeelment {
public static void main(String[] args) {
	  ArrayList<String> array = new ArrayList<>();
	  array.add("blue");
	   array.add("black");
	   array.add("yellow");
	   array.add("grey");
	   array.add("white");
	   System.out.println(array);
	   array.remove(3);
	   System.out.println(array);
}
}
