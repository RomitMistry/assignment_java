import java.util.ArrayList;
import java.util.HashSet;

public class convert {
	public static void main(String[] args) {
		
	
	  HashSet<String> hash_set = new HashSet<>();
	  
      hash_set.add("tulip");
      hash_set.add("rose");
      hash_set.add("orchid");
      hash_set.add("marie-gold");
      System.out.println(hash_set);
      
      ArrayList<String> flower_array
      = new ArrayList<>(hash_set);
      
      System.out.println(
              "Elements of flower Arraylist are :");
          System.out.println(flower_array);
         
}
}