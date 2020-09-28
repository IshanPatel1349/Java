import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSorting {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Ishan");
		map.put(2, "Mukesh");
		map.put(3, "Panna");
		map.put(5, "Swati");
		map.put(8, "Mukesh");

	HashMap<Integer,String> map1=	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	
	for(Map.Entry<Integer, String> mp: map1.entrySet())
	{
		System.out.println(mp);
	}
	
	
	
	}

}
