import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class _HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ishan");
		map.put(2, "Patel");
		map.put(3, "Mukesh");

		map.put(4, "Rana");
	
		
		
		HashMap<Integer,String> mp=map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                LinkedHashMap::new));
		
		System.out.println(mp);
			
	}

}
