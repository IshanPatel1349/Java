import java.util.Optional;

public class OptionalFilter {

	public static void main(String[] args) {
	
		Optional<String> withValue=Optional.of("Map");
		Optional<String> withoutValue=Optional.empty();
		//Optional<String> withNull=Optional.of(null);
		
		
		System.out.println(withValue.filter(p->p.equals("MaP")));
		
		System.out.println(withValue.filter(p->p.equalsIgnoreCase("MaP")));
		System.out.println(withoutValue.filter(p ->p.isEmpty()));
		//System.out.println(withNull.filter(p -> p.equals(null)));
		
		
		
		
		
		
	}

}
