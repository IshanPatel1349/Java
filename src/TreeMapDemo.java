import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
   public static void main(String[] args) {
      
      // creating tree map 
   Map<Integer, String> treemap = new HashMap<Integer, String>();

      // populating tree map
      treemap.put(1, "two");
      treemap.put(1, "one");
      treemap.put(3, "three");
      treemap.put(6, "six");
      treemap.put(5, "five");

      // putting values in navigable map
     // NavigableMap nmap = treemap.descendingMap();

      Map<Integer, String> treemap1 = new TreeMap<Integer,String>();
      treemap1.putAll(treemap);
      
      System.out.println("Checking value");
      System.out.println("Navigable map values: "+treemap);
      System.out.println("Navigable map values: "+treemap1);
   }    
}