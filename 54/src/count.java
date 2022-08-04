import java.util.HashMap;

public class count {
public static void main(String[] args) {
	HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
	 hash_map.put(1, "blue");
	 hash_map.put(2, "green");
	 hash_map.put(3, "yellow");
	 hash_map.put(4, "grey");
	  System.out.println(hash_map);
	  System.out.println("number of elements::"+hash_map.size());
}
}
