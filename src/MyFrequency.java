import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Customer

{
	private String name;
	private int age;
	private int falied;

	public Customer(String name, int age, int falied) {

		this.name = name;
		this.age = age;
		this.falied = falied;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", falied=" + falied + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (falied != other.falied)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class MyFrequency {

	public static void main(String[] args) {
   
		List<Customer> li = new ArrayList<Customer>();
		li.add(new Customer("Ram",23,1));
		li.add(new Customer("Sita",56,3));
		li.add(new Customer("Priya",45,4));
		li.add(new Customer("Ram",23,1));
		
		int i =(Collections.frequency(li, new Customer("Ram",23,1)));
	
		
		
	}

}
