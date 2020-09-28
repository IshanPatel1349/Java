import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartioningList {

	public static void main(String args[]) {

		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> map = li.stream().collect(Collectors.partitioningBy(s -> s > 5));
		List<List<Integer>> li1 = new ArrayList<List<Integer>>(map.values());

		System.out.println(li);
		System.out.println(li1);

		for (List<Integer> li2 : li1) {
			System.out.print(li2 +" ");
		}

	}

}
