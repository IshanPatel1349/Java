import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate03 {

	public static void main(String[] args) {

		Stream<Integer> str = Stream.of(1, 2, 3, 4, 5, 5, 3);
        
	List<Integer> lis=	str.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(m ->m.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(lis);
		
		
		
	}

}
