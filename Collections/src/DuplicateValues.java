import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateValues {
	
	public static void main (String args[])
	{
		Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		
		Set<Integer>  set2=findDuplicateValue(stream);
		
		System.out.println(set2);
		
		
		
	}

	private static Set<Integer> findDuplicateValue(Stream<Integer> li) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		
	
	return li.filter(n -> !set1.add(n)).collect(Collectors.toSet());	
		
	}
	

}
