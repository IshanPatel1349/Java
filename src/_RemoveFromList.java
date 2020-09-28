import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _RemoveFromList {

	public static void main(String[] args) {
		List<Ji> JiList=new ArrayList<Ji>();
		Ji obj1 = new Ji("Ajay", 3);
		Ji objDelta = new Ji("Ajay", 3);
		Ji obj2 = new Ji("Sneha", 4);
		Ji obj3 = new Ji("Simran", 5);
		Ji obj4 = new Ji("Ajay", 5);
		Ji obj5 = new Ji("Ajay", 1);
		Ji obj6 = new Ji("Sneha", 7);
		JiList.add(obj1);
		JiList.add(obj1);
		JiList.add(obj1);
		JiList.add(obj2);
		JiList.add(obj3);
		JiList.add(obj4);
		JiList.add(obj5);
		JiList.add(obj6);
		JiList.add(objDelta);
		
		while(JiList.contains(obj1)) {
		JiList.remove(obj1);
		}
		System.out.println(JiList);
		
		List<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(1);
		li.add(2);
		
		while (li.contains(1))
			li.remove(1);
		
		System.out.println(li);
		
		/*
		 * System.out.println(JiList); removeAll(JiList, obj1);
		 * 
		 * // JiList.removeIf(x-> x.equals(obj)); System.out.println(JiList);
		 */
		
		

		/*
		 * List<Integer> li = new ArrayList<Integer>(); li.add(1); li.add(2); li.add(4);
		 * li.add(9); li.add(4); li.add(4);
		 * 
		 * li.add(4);
		 * 
		 * li.stream().filter(x -> !(x ==
		 * 4)).collect(Collectors.toList()).forEach(System.out::println);
		 * 
		 * // removeAll(li, 4);
		 * 
		 while (li.contains(4)) li.remove(4);
		 * 
		 * System.out.println( li);
		 * 
		 * li.removeIf(x -> (x==4)); System.out.println( li);
		 * 
		 * //System.out.println(li);
		 */
	}

	private static void removeAll(List<Ji> li, Ji i) {
		int index;
		while ((index = li.indexOf(i)) >= 0) {
			li.remove(index);
		}
	}

}




class Ji
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ji other = (Ji) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	private String name;
	private int roll;
	public Ji(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Ji [name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
