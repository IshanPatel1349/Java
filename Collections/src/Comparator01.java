import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator01 {

	public static void main(String[] args) {
		// create ArrayList to store Student
		List<Student> al = new ArrayList<>();

		// create customer objects using constructor initialization
		Student obj1 = new Student("Ajay", 27, 3);
		Student obj2 = new Student("Sneha", 23, 4);
		Student obj3 = new Student("Simran", 37, 5);
		Student obj4 = new Student("Ajay", 22, 5);
		Student obj5 = new Student("Ajay", 29, 1);
		Student obj6 = new Student("Sneha", 22, 7);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);
		System.out.println("Unsorted Collections");
		for (Student s : al) {
			
			System.out.println(al);
		}
		System.out.println("Sorted Collections");
		Collections.sort(al);
		System.out.println(al);
		
		/*
		 * Collections.sort(al, new Com()); System.out.println("Sorted Collections");
		 * for (Student s : al) {
		 * 
		 * System.out.println(al); }
		 */
	}

}

/*
 * class Com implements Comparator<Student> {
 * 
 * @Override public int compare(Student o1, Student o2) { int nameCompare =
 * o1.getName().compareTo(o2.getName()); int rollNum = o1.getRollNum() -
 * o2.getRollNum();
 * 
 * if (nameCompare == 0) { return rollNum == 0 ? nameCompare : rollNum;
 * 
 * } else {
 * 
 * return nameCompare; } }
 * 
 * }
 */

class Student  implements Comparable<Student>{

	private String name;
	private int age;
	private int rollNum;

	public Student(String name, int age, int rollNum) {

		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNum=" + rollNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNum;
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum != other.rollNum)
			return false;
		return true;
	}




	public int compareTo(Student o) {
		return this.getAge()-(o.getAge());
	}

}