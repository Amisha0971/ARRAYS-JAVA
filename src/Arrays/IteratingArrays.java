package Arrays;

public class IteratingArrays {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		//System.out.println(numbers.length); 
		
		// Using For loop
		
		for (int i = 0; i < numbers.length; i++) {
		//System.out.println(numbers[i]);
		}

		//Using Enhanced for loop
		
		for (int num : numbers) {
		    System.out.println(num);
		}

	}

}
