import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        // Creating an array
        int[] arr = {5, 3, 1, 4, 2};
        
        // Finding the length of the array
        int length = arr.length;
        System.out.println("Length of the array: " + length);
        
        // Copying the array with padding
        int[] copyArr = Arrays.copyOf(arr, 7);
        System.out.println("Copied array with padding: " + Arrays.toString(copyArr));
        
        // Filling the array with a specified value
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArr));
        
        // Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        // Searching for a value in the array
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of value 3 in sorted array: " + index);

        
    }
}
