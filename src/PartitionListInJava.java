import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		givenList_whenParitioningIntoSublistsUsingPartitionBy_thenCorrect();

	}
	public static void givenList_whenParitioningIntoSublistsUsingPartitionBy_thenCorrect() {
	    List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	 
	    Map<Boolean, List<Integer>> groups = 
	      intList.stream().collect(Collectors.partitioningBy(s -> s > 6));
	    List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
	 
	    List<Integer> lastPartition = subSets.get(1);
	   // List<Integer> expectedLastPartition = Lists.<Integer> newArrayList(7, 8);
	    
	    System.out.println(groups);
	    System.out.println(subSets);
	    System.out.println(lastPartition);
	    
	  
	}

}
