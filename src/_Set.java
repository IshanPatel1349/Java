import java.util.HashSet;
import java.util.Set;



public class _Set {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("Ishan");
		set.add("Manoj");
		set.add("1");
		set.add("ManiKarma");
		
		
		
		
		boolean b = set.remove("Manoj");
		boolean c = set.remove("4");
		System.out.println(b+" "+c);
		
		
		set.addAll(new HashSet<String>() { {
		this.add("as");
		this.add("vipin");
		}});
		System.out.println(set);
		
		
		set.removeAll(new HashSet<String>() {{
			
			this.add("Ishan");
		}});
		System.out.println(set);
		
		set.retainAll(new HashSet<String>() {{this.add("as");}});
		
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
		

	}

}
