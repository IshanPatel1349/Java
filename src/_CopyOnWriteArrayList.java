import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class _CopyOnWriteArrayList {

	public static void main (String args [])

	{
		
		CopyOnWriteArrayList<Integer> numbers 
		  = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext())
		{
			
			
			System.out.println(iterator.next());
		
			numbers.add(7);
			
		}
		

	}
	
}
