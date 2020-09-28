import java.util.Collection;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class _Splitrator {
 
	  
  
	//static int i=1;  
	public static void main(String[] args) {  
	        Collection<Character> collection = new ConcurrentLinkedQueue();  
	for (char i='A';i<='Z';i++) {  
	collection.add(i);  
	        }  
	System.out.println("Values : " +collection);  
	//spliterator  split and iterate the split parts in parallel  
	Spliterator<Character>str = collection.spliterator();  
	// if element exists tryAdvance() will perform action  
	while(str.tryAdvance((n)->System.out.print(n+" ")));  
	    }  
	} 

