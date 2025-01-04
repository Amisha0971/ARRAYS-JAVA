package Arrays;

import java.util.Arrays;

public class SearchingArray {

    public static void main(String[] args) {

        // Define and sort the array
        int[] numbers = {5, 1, 4, 2, 3};
        Arrays.sort(numbers); // Sort the array before binary search

        // Perform binary search for the value 4
        int index = Arrays.binarySearch(numbers, 3);

        // Print the sorted array and the result
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Index of 4: " + index);
    }
}
