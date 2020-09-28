import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class _CountNull {
	public static void main(String args[]) {
		List<Object> list = Arrays.asList(1, 2, 3,"","");

		System.out.println(list.stream().filter(p->p.equals("")).count());

	}
}
