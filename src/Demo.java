import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
   public static void main(String args[]) {
      Map<Integer, String> map = new HashMap<>();
      map.put(null, "One");
      map.put(, "Two");
      map.put(3, "Three");

      System.out.println("HashMap = " + map);
      Map<Integer, String> treeMap = new TreeMap<>();
      treeMap.putAll(map);
      System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);
   }
}