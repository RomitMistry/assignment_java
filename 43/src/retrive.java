import java.util.ArrayList;

public class retrive {
public static void main(String[] args) {
   ArrayList array = new ArrayList();
   array.add("blue");
   array.add("black");
   array.add("yellow");
   array.add("grey");
   array.add("white");
   System.out.println(array);
   String element = (String) array.get(0);
   System.out.println("first element :: "+element);
   element = (String) array.get(4);
   System.out.println("fifth element :: "+element);
   

}
}
