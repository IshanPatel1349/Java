import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _Set03 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Ishan");
		set.add("Manoj");
		set.add("1");
		set.add("ManiKarma");

		// Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
		
			String value = itr.next();
			set.add("Ishan1");
			set.remove("1");
			System.out.println(set);
		}
	}
}