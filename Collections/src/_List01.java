import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.Test;

public class _List01 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>(Arrays.asList("Ishan","Vivek","Payal"));
		li.add("Ihsna");
			
	
	
		
		System.out.println(li.stream().count());
		givenUsingTheJdk_whenUnmodifiableListIsCreated_thenNotModifiable();
		

	}

	public static void givenUsingTheJdk_whenUnmodifiableListIsCreated_thenNotModifiable() {
	    List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
	    List<String> unmodifiableList = Collections.unmodifiableList(list);
	    unmodifiableList.add("four");
	}

}
