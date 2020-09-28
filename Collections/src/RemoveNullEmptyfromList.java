import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullEmptyfromList {

	public static void main(String[] args) {
	
		List<Object> li = new ArrayList<Object>();
		li.add(1);
		li.add(2);
		li.add(null);
		li.add("");
		
		List<Object> lu=li.stream().filter(Objects::nonNull).filter(p ->!p.equals("")).collect(Collectors.toList());
		System.out.println(lu);
		

	}

}
