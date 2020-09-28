import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToFindDuplicateValue {

	public static void main(String[] args) {
	
		
		Stream<Integer> stream= Stream.of(1,2,3,4,5,4,5,6);
		
		List<Integer> sr=findDuplicateValue(stream);
		System.out.println(sr);

	}

	private static List<Integer> findDuplicateValue(Stream<Integer> stream) {
		
	List<Integer> st=stream.collect(Collectors.toList());
	
		Set<Integer> set1 = new HashSet<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		for(Integer in:st)
		{
			if(!set1.add(in))
			{
				li1.add(in);
			}
		
		}

		return li1;
	}

}
