import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MukeshCount {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("My name is name i am working i bemkek technology");
		
		String str = list.get(0);
		String str1 = str.replace(" ", ",");
	    String[] str3= str1.split(",");

		List<String> li = Arrays.asList(str3);
	
		System.out.println(li);
		Map<String, Long> map=li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);

	}

}
