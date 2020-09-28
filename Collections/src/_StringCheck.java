
public class _StringCheck {
	public static void main(String[] args) {
		String s= new String("Mukesh");
		String s4= new String("Mukesh");
		String s2="Mukesh";
		String s3="Muk" +"esh";
		System.out.println(s==s2);
		System.out.println(s==s4);
		System.out.println(s==s3);
		System.out.println(s2==s3);
		System.out.println(s.equals(s3));
	
		System.out.println(s3.equals(s2));
		System.out.println(s.equals(s4));
	}
}
