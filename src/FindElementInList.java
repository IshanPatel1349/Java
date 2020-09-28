import java.util.ArrayList;
import java.util.List;

public class FindElementInList {

	public static void main(String[] args) {
		List<Baby> Babys = new ArrayList<>();
		Babys.add(new Baby(1, "Jack"));
		Babys.add(new Baby(2, "James"));
		Babys.add(new Baby(3, "Kelly"));
		boolean b = Babys.stream().filter(p -> p.getName().equals("Jack")).findAny().isPresent();
		System.out.println(b);
		
		Baby c = Babys.stream().filter(p ->p.getName().equals("Kelly")).findAny().orElse(null);
		System.out.println(c.toString());
	
	}

}

class Baby {

	public Baby(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Baby [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baby other = (Baby) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}