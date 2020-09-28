import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddItems {

	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList();
		list.add("red");
		list.add("red");
		list.add("blue");
		list.add("green");
		
		List<String> list2 = new ArrayList();
		list2.add("red");
		list2.add("red");
		list2.add("blue");
		list2.add("pink");
		
		///List<String> otherList = Arrays.asList("red", "green", "green", "yellow");
   list.stream().distinct().filter(list::contains).collect(Collectors.toList()).forEach(System.out::println);
		
		/*
		 * List<Integer> li = Arrays.asList(12,13,14);
		 * 
		 * 
		 * 
		 * List<Integer> li2 = new ArrayList<Integer>();
		 * 
		 * li2.addAll(li); li2.add(15);
		 * 
		 * System.out.println(li2); System.out.println(li); // li.add(90);
		 * System.out.println(li2); System.out.println(li);
		 * 
		 * 
		 */

	}

}
