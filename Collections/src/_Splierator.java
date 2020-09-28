import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class _Splierator {

	
	public static void main(String args [])
	{
		List<String> wordList = Arrays.asList("Mukesh","Satija","Ishan","Manog","Manoj","Ishan","uman");
		
		
		Spliterator<String> splitrator = wordList.spliterator();
       
		Spliterator<String> spit = splitrator.trySplit();
		
		spit.forEachRemaining(System.out::println);
		
		
		System.out.println("*************************");
		splitrator.forEachRemaining(System.out::println);
		
		
		System.out.println(splitrator.hasCharacteristics(splitrator.characteristics()));
		
		
	}
}
