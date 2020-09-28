

	public class _BitwiseOperator {
		   public static void main(String[] args) {
		      int a = 60;          int b = -60;        int c = 0;
		      System.out.println("60  = " + Integer.toBinaryString(a));
		      System.out.println("-60 = " + Integer.toBinaryString(b));

		      //signed shift
		      c = a >> 1;              
		      System.out.println("60 >> 1  = " + Integer.toBinaryString(c));

		      //unsigned shift
		      //The unsigned right shift operator '>>>' do not use the sign bit to fill the trailing positions. It always fills the trailing positions by 0s.
		      c = a >>> 1;            
		      System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) +" "+c );

		      c = b >> 1;              
		      System.out.println("-60 >> 1  = " + Integer.toBinaryString(c)  +c);

		      c = b >>> 1;            
		      System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
		   }
		}