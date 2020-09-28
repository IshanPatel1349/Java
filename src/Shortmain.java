import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shortmain {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student01(8,"Mukesh",22));
		list.add(new Student(5,"Manoj",56));
		list.add(new Student(13,"Ankesh",44));
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s.rollno+":"+s.name+":"+s.age);
		}
	}

}
class Student01 implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	Student(int age, String name, int rollno) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (age == o.age)
			return 0;
		else if (age > o.age)     //if you want reverse order than age <o.age return 1 and else  -1;
			return 1;
		else                            //return name.compareTo(o.name); if you want compare name.
			return -1;
	}

}