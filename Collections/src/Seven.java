
public class Seven {
	public static void main(String args[]) {
		int[] numbers = { 2, 4, 3, 6, 5, 8, 1,2,9 };
		prettyPrint(numbers, 7);
	}

	public static void printPairs(int[] array, int sum) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if ((array[i] + array[j]) == sum) {
					System.out.printf("(%d, %d) %n", array[i], array[j]);
				}
			}

		}
	}

	public static void prettyPrint(int[] givenArray, int givenSum) {
		
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		printPairs(givenArray, givenSum);
	}

}