import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _DuplicateValue {

	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(1,2,3,4,5,3,2);
		Set<Integer> set1 = new HashSet<>();
		System.out.println(str.filter(n -> !set1.add(n)).collect(Collectors.toSet()));
		
		
		
		
	}

}
