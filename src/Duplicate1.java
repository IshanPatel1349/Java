import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate1 {

	public static void main(String[] args) {
		Stream<Integer> stream= Stream.of(1,2,3,4,5,6,7,8,8,9);
		
	List<Integer> li=	stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(m ->m.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
	System.out.println(li);	
		
	}

}
