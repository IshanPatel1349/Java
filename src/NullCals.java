
public class NullCals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Overideen.objectclass(null);
	}

}


class Student9090{
	private int age;
	private String name;
	public Student9090(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	
}

class Overideen{
	
	public static void objectclass(Student9090 s) {
		System.out.println("in int class");
	}
	
	/*
	 * public static void objectclass(int s) { System.out.println("in int class"); }
	 */
	
	
	
	
	  public static void objectclass(Number s) {
	  System.out.println("in number class"); }
	 
	 
	 
	
	/*
	 * public static void objectclass(String s) {
	 * System.out.println("in string class"); }
	 */
	 
	
	/*
	 * public static void objectclass(Object s) {
	 * System.out.println("in object class"); }
	 */
	 
		
		
	/*
	 * public static void objectclass(Integer s) {
	 * System.out.println("in integer class"); }
	 */
		 
}
//always call specific class first warper class like string ,Integer