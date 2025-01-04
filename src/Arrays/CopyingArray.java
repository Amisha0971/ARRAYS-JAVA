package Arrays;

import java.util.Arrays;

public class CopyingArray {

    public static void main(String[] args) {

        // Using System.arraycopy:
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);

        // Printing original array
        System.out.println("Original Array:");
        for (int value : original) {
            System.out.print(value + " ");
        }

        System.out.println("\nCopied Array:");
        // Printing copied array
        for (int value : copy) {
            System.out.print(value + " ");
        }
        
        

    }
}
