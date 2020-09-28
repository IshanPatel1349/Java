import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("A", "B", "C", "D");
		Optional<String> result1 = stringStream.findAny();
		System.out.println(result1.get());
		// Optional<String> result2 = stringStream.findFirst();

		Supplier<Stream<String>> supp = () -> (Stream.of("A", "B", "C", "D"));

		Optional<String> rsult1 = supp.get().findAny();

		System.out.println(rsult1);
	
		
		Optional<String> result2 = supp.get().findFirst();
		System.out.println(result2.get());
	}

}
