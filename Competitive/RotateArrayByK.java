import java.util.Arrays;

public class RotateArrayByK {

    static void reverseArray(int[] array, int start, int last){
        while (start< last) {
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }
    }

    static void rotateArray(int[] array, int k){
        k = k % array.length;
        reverseArray(array, 0, array.length-1);
        reverseArray(array, 0, k-1);
        reverseArray(array, k, array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        rotateArray(array, 6);
        System.out.println(Arrays.toString(array));
    }
    
}
