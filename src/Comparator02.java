import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator02  {
	
	public static void main (String args[])
	{
		List<Girls> al = new ArrayList<>();

		// create customer objects using constructor initialization
		Girls obj1 = new Girls("Ajay", 27, 3);
		Girls obj2 = new Girls("Sneha", 23, 4);
		Girls obj3 = new Girls("Simran", 37, 5);
		Girls obj4 = new Girls("Ajay", 22, 5);
		Girls obj5 = new Girls("Ajay", 29, 1);
		Girls obj6 = new Girls("Sneha", 22, 7);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);
		System.out.println("Unsorted Collections");
		
		/*
		 * Collections.sort(al, new MyCom());
		 * 
		 * 
		 * for(Girls g :al) { System.out.println(g); }
		 */
		
		
	al.stream().sorted(Comparator.comparing(Girls::getName).thenComparing(Comparator.comparing(Girls::getSalary))).forEach(System.out::println);
		
	}


}
class MyCom implements Comparator<Girls>
{

	@Override
	public int compare(Girls o1, Girls o2) {
		return o1.getName().compareTo(o2.getName());
				
				
	
	
	
	}
	
	
	
}

class Girls
{
	
	private String name;
	private int rollNumber;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	private float salary;
	public Girls(String name, int rollNumber, float salary) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Girls [name=" + name + ", rollNumber=" + rollNumber + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
}

