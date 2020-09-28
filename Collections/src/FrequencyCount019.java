import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount019 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mukesh", "manoj", "Manoj", "Ishan", "Ankesh", "Mukesh");
		Set<String> hs = new HashSet<>(list);
		for (String s : hs) {
			System.out.println(s + ":" + FrequencyCount019.frequency1(list, s));
		}
		
		
	Map<String, Long> map=	list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(map);
	}



public static int frequency1(Collection<?> c, Object o) {
int result = 0;
if (o == null) {
    for (Object e : c)
        if (e == null)
            result++;
} else {
    for (Object e : c)
        if (o.toString().equalsIgnoreCase((String) e))
            result++;
}
return result;
}
}