import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortaList {
	public static void main(String args[])

	{

		List<Integer> li = Arrays.asList(3, 44, 5, 66, 76, 8);
		/*
		 * List<Integer> result = li.stream()
		 * .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
		 * .collect(Collectors.toList());
		 */
		Optional<Integer> max = li.stream()
			    .max((Comparator.naturalOrder()));	
		
	System.out.println(max.get());

	}

}
