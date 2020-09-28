import java.util.ArrayList;
import java.util.List;

public class _LinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(5);
		li.add(0);
		li.add(1);
		
		int i = li.removeFirst();
		System.out.println(li.removeFirstOccurrence(1));
		System.out.println(li);

		int i1 = li.poll();
		System.out.println(i1);
		li.push(9);
		System.out.println(li);

	}

}
