import java.util.HashMap;


public class collectuionview {
public static void main(String[] args) {
	HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
    hash_map.put(1,"black");
    hash_map.put(2,"red");
    hash_map.put(3,"yellow");
    hash_map.put(4,"pink");
    hash_map.put(5,"purple");
    
    System.out.println("Collection view is: "+ hash_map.values());
}
}
