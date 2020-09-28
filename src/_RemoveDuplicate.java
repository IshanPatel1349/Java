import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 3, 2);
		
		List<Integer> ay1 = new ArrayList<>(li);
		
		List<Integer> ay = new ArrayList<>();
		 ay.addAll(ay1);
		 
		 List<Integer> source = Arrays.asList(1, 2, 3);
		 List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
		 Collections.copy(dest, source);
		 System.out.println(dest);
		
		
		List<Integer> li3 = ay.stream().filter(s -> s>5).collect(Collectors.toList());
		System.out.println(li3);
		
		
		
		
		/*
		 * System.out.println(ay1); System.out.println(ay);
		 */
		
		
		
		
		
		//li.add(2);
		List<Integer> li22 = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 2, 3);

		List<Integer> li2 = li.stream().map(m -> m).distinct().collect(Collectors.toList());

		

	}

}
