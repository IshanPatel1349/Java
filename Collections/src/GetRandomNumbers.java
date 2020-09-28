import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.event.ListSelectionEvent;

public class GetRandomNumbers {

	public static void main(String[] args) {
		//givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat();
		givenList_whenSeriesLengthChosen_shouldReturnRandomSeries();
	}

	public static void givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat() {
		Random rand = new Random();
		List<String> givenList = Arrays.asList("one", "two", "three", "four");

		int numberOfElements = 2;

		for (int i = 0; i < numberOfElements; i++) {
			 int randomIndex = rand.nextInt(givenList.size());
		        String randomElement = givenList.get(randomIndex);
		        System.out.println(randomElement);
		        givenList.remove(randomIndex);
		}
	}
		public static void givenList_whenSeriesLengthChosen_shouldReturnRandomSeries() {
		    List<Integer> givenList = Arrays.asList(1, 2,3,4,5);
		    Collections.shuffle(givenList);
		 
		    int randomSeriesLength = 3;
		 
		    List<Integer> randomSeries = givenList.subList(0, randomSeriesLength);
		    
		    System.out.println(randomSeries);
		}
		
	}

