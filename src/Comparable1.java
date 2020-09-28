
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

/*
 * class Student { String name; int age;
 * 
 * Student(String name, int age) { super(); this.name = name; this.age = age; }
 * }
 */

class MyCompare implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.age - (o2.age);
	}
}

class MyCompare1 implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.name.compareTo(o2.name);
	}

}

public class Comparable1 {
	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee("Mukesh", 30));
		list1.add(new Employee("Manoj", 32));
		list1.add(new Employee("Ishan", 31));
		// list1.add(new Student("Ishan", 31));

		Collections.sort(list1, new MyCompare());

		for (Employee e : list1) {

			System.out.println(e.name + " " + e.age);
			// list1.add(new Employee("Vikas", 131));
		}
		System.out.println("*****************************");
		
		list1.add(new Employee("Gikas", 131));

		Collections.sort(list1, new MyCompare1());
		for (Employee e1 : list1) {
			System.out.println(e1.name + " " + e1.age);
		}

	}
}
