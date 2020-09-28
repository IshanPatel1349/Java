import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ishan.Patel
 *
 */
/**
 * @author Ishan.Patel
 *
 */
public class _List {

	public static void main(String args[]) {
		List<String> li = new ArrayList<>();
		li.add("Ishan");
		li.add(0, "Kavneet");
		li.add("Ishan Patel");
		li.add("Ishan Patel");
		li.add("Kavneet Kaur Narula");

		//System.out.println(li);

		//System.out.println(li.stream().count());

		li.remove(3);

		System.out.println(li.stream().count());
		
		
		
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			String w = (String) itr.next();
			System.out.print(w +" ");
		}
		
		
		for (String s :li)
		{
			//System.out.println(s);
		}
		
		li.stream().distinct().forEach(System.out::println);

	}

}
