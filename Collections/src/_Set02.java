import java.util.HashSet;

public class _Set02 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("Ishan");
		hs.add("Ishan");
		hs.add("Vimal");
		hs.add("Vishaka");

		System.out.println(hs.remove("Vimal"));

		System.out.println(hs);
//
		hs.addAll(new HashSet<String>() {
			{
				this.add("Vikram");
				this.add("Sunami");

			};
		});

		System.out.println(hs);

		for (String s : hs) {
			System.out.print(s + " ");
			System.out.println();
		}
//
		hs.removeAll(new HashSet<String>() {
			{
				this.add("Sunami");
			}
		});

		System.out.println(hs);
		
		
		hs.retainAll(new HashSet<String>() {{this.add("Ishan");};});
		
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		
	}
	

	
}