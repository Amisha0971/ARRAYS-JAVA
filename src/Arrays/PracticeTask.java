package Arrays;

public class PracticeTask {

    public static void main(String[] args) {
        
        // Program to Find the Maximum Element in an Array
        int[] numbers = {10, 20, 5, 15, 30};
        int max = findMaximum(numbers);
        System.out.println("Maximum value: " + max);

        // Program to Reverse an Array
        int[] numberArray = {1, 2, 3, 4, 5};
        reverseArray(numberArray);
        System.out.print("Reversed Array: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
    }

    // Method to find the maximum value in an array
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to reverse an array
    public static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}
