import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String args[]) {
		Set<Son> hashSet = new HashSet<>();
		hashSet.add(new Son("First",3));
		hashSet.add(new Son("Second",4));
		hashSet.add(null);
		hashSet.add(null);
		Iterator<Son> itr = hashSet.iterator();
		Thread t = new Thread();
		System.out.println(hashSet.contains(new Son("First",3)));
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			itr.remove();

		}
	System.out.println(new Son("First",3).getClass().getSuperclass());
	System.out.println(t.getClass().getSuperclass());	
	
	char a = 'a';
	System.out.println(a+31);
	
	}
}

class Son  {
	private String name;
	private int rollNumber;

	public Son(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Son [name=" + name + ", rollNumber=" + rollNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNumber;
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
		Son other = (Son) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}

	
	public int compareTo(Son o) {
	 return o.getRollNumber()- this.getRollNumber();		
	}

}