import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountCharacter02 {
	public static void main(String args[]) {
		String result = "MUuuKESHKUMARYADAV";
		String str = result.toUpperCase();
		List li = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			String a = String.valueOf(str.charAt(i));
			li.add(a);
		}

		Set<String> set1 = (Set<String>) li.stream().collect(Collectors.toSet());
		for (String o : set1) {
			System.out.println("[" + o + "] :" + Collections.frequency(li, o));
		}

	}

}
