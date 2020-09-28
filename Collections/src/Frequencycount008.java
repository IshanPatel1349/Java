import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Frequencycount008 {
	public static void main(String[] args) {
		List<String> s1 = Arrays.asList("Mukesh","manoj","Manoj","Ishan","Ankesh","Mukesh");
		//String s= ((String) s1).toUpperCase();
		//List<String> s2 =(List<String>) s1.stream().map(p ->p.toUpperCase());
		//List<String> list= s1.stream().map(p ->p.toUpperCase()).collect((Collectors.toList()));
		Set<String> hs=new HashSet<>(s1);
		for(String sa:hs) {
			System.out.println(sa +":"+Collections.frequency(s1, sa));
		}
	}

}