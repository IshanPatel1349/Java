public class _As {

	 public static void main(String args[]) 
	    { 
	        String  n = "String"; 
	  
	        System.out.println(countways(n)); 
	    } 
	 
	 
	 public static int countways(String  s) 
	    { 
		int n = s.length();
		return count(n);
		//return value;
	        
	    }
	 public static int count(int n) {
		 if (n == 1) 
	            return 0; 
	        else if (n % 2 == 0) 
	            return 1 + count(n / 2); 
	        else
	            return 1 + Math.min(count(n - 1), count(n + 1)); 
	    } 
	 
		 
	 }
	
