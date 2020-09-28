import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequecncyFing {

	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(null,null,3,4,3,2);
		
		List<Integer> li = str.collect(Collectors.toList());
		
	Set<Integer>li2= li.stream().filter(i ->Collections.frequency(li, i)>1).collect(Collectors.toSet());
	
	System.out.println(li2);
		
		
		
		
		
		
	}

}
