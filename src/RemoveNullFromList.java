import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Remove nuul from list
public class RemoveNullFromList {

	public static void main(String[] args) {
		
		
		
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,null,null);
		
		List<Integer> li2= li.stream().filter(Objects::nonNull).collect(Collectors.toList());
		
		System.out.println(li2);

	}

}
