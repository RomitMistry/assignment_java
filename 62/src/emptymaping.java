import java.util.HashMap;

public class emptymaping {
public static void main(String[] args) {
	HashMap<Integer, String> hash_map = new HashMap<Integer,String>();
	hash_map.put(1, "yellow");
	hash_map.put(2, "green");
	hash_map.put(1, "blue");
	hash_map.put(1, "grey");
	
	Boolean result = hash_map.isEmpty();
	 System.out.println("Is hash map empty: " + result);
	 
	 hash_map.clear();
	 result = hash_map.isEmpty();
	 System.out.println("is hash map empty:: "+result);
}
}
