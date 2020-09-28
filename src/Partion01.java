import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Partion the BigList into small sublists by Employee title
public class Partion01 {

	public static void main(String args[]) {
		List<String> li = Arrays.asList("Ishan Patel", "Monaj Kumar", "Manoj Singh", "Mukesh Singh", "Mukesh Singh");

		// Predicate<String> p = o->o.contains("Patel");
		/*
		 * Map<Boolean,List<String>> mp=li.stream().map(p
		 * ->p).collect(Collectors.partitioningBy(b->b.contains("Singh")));
		 * List<List<String>> li1= new ArrayList<List<String>>(mp.values());
		 * System.out.println(li1);
		 */
		Function<String, String> fi = s -> s.substring(s.indexOf(" "), s.length());

		List<List<String>> liu = li.stream().map(p -> p).collect(Collectors.groupingBy(fi)).entrySet().stream()
				.map(Map.Entry::getValue).collect(Collectors.toList());
		
		
	Map<String, List<String>> mi=	li.stream().map(p -> p).collect(Collectors.groupingBy(fi));
	System.out.println(mi);
		

		for (List<String> liy : liu) {
			System.out.println(liy);

		}

	}

}
