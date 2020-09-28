import java.util.Optional;

public class _OptionalsFilter {

	public static void main(String[] args) {
	Optional<String> havingValues=Optional.of("Male");
	Optional<String> noValues=Optional.ofNullable(null);
	System.out.println(havingValues.filter(p->p.equals("Male")));
	
	noValues.orElse("Ishan");
	System.out.println(noValues.filter(p ->!p.isEmpty()));
	
	System.out.println(noValues.orElse("Ishan"));
	

	}

}
