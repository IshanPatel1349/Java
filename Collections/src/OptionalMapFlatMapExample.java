import java.util.Optional;

public class OptionalMapFlatMapExample {

	public static void main(String[] args) {
		Optional<String> withValues = Optional.of("Male");
		Optional<String> withoutValue = Optional.empty();
       
	System.out.println(withValues);
	System.out.println(withoutValue);	
	
	Optional<Optional<String>> optionals = Optional.of(Optional.of("Male"));
	optionals.map(m ->m.get().toUpperCase()).ifPresent(System.out::println);
	
	optionals.flatMap(m-> m.get().toUpperCase(m->m.get()));
	
		
		
	}

}
