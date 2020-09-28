import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencCount {

	public static void main(String[] args) {

		Stream<Integer> str = Stream.of(1, 2, 3, 4, 5, 6, 8, 7, 4);
       
		Map<Integer, Long>mp=str.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(mp);
		
		
		
	}
	
	
	
	
	

}
