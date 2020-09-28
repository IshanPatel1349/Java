import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class _ArrayList {

	public static void main(String[] args) {
		List<String> list = LongStream.range(0, 16)
				  .boxed()
				  .map(Long::toHexString)
				  .collect(Collectors.toCollection(ArrayList::new));
				List<String> stringsToSearch = new ArrayList<>(list);
				stringsToSearch.addAll(list);

	
	System.out.println(list);
	System.out.println(stringsToSearch);
	
	System.out.println(list.indexOf("e"));
	System.out.println(stringsToSearch.lastIndexOf("e"));
	
	Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));
	 
	Map<String,Long> result = stringsToSearch
	  .stream()
	  .filter(matchingStrings::contains)
	  .collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(result);
	
	List<String> copy = new ArrayList<>(stringsToSearch);
	Collections.sort(copy);
	System.out.println(copy);
	int index = Collections.binarySearch(copy, "b");
	System.out.println(index);
	System.out.println(copy.indexOf("b"));
	System.out.println(copy.lastIndexOf("b"));
	
}
}
