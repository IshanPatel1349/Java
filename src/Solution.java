import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {
    /*
     * Complete the 'sort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY toSortArray as parameter.
     */
	public static List<Integer> sort(List<Integer> toSortArray) {
		Collections.sort(toSortArray);

		return toSortArray;

	}

}

public class Solution {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 3, 6, 2, 7, 12, 34);
		Result result = new Result();
		result.sort(list);
		System.out.println(list);

	}

}
