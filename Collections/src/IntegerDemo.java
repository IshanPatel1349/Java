
public class IntegerDemo {

	public static void main(String args[])

	{
		Integer n1 = new Integer("5"); //We are storing primitive int value into Integer objects, it is called Boxing.
		Integer n2 = new Integer(2); // Boxing------- this is not Autoboxing. This is simple createing integer oject initialised
										// via constructor parameter
		Integer n3 = 4; /// this is an example of AutoBoxing
		// Integer n4 = new Integer("A");
		//System.out.println(n1 + " " + n2 + " " + n3);// prints 5 2 4 -----here is un boxing
		
		
		
		String s1 = Integer.toHexString(8);  /// base 16
		String s2 = Integer.toOctalString(8); /// base 8
		String s3 = Integer.toBinaryString(8);// base 2
		System.out.println(s1 + " " + s2 + " " + s3); // prints 8 10 1000

	}
}
