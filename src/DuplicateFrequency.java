import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateFrequency {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 4, 3);

		List<Integer> li =findDuplicateValue(stream);
System.out.println(li);
	}

	private static List<Integer> findDuplicateValue(Stream<Integer> stream) {
		Set<Integer> items = new HashSet<Integer>();
		return stream.filter(n ->!items.add(n) ).collect(Collectors.toList());
	
		
		
		
	}

}
