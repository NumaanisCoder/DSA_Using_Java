import java.util.Arrays;

public class InsertionSort {

    // Insertion Sort

    static void InsertionSortF(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i-1;

            // for(; j > -1; j--){
              
            //     if(key < array[j]){
            //        array[j+1] = array[j];
            //     }else{
            //         break;
            //     }
            // }

            while( j > -1 && key < array[j]){
                array[j+1] = array[j];
                System.out.println("ROUND "+i+": "+Arrays.toString(array));
                j--;
            }

            array[j+1] = key;
            
        }
    }

    public static void main(String[] args) {

        int[] array = {3,2,1};
        InsertionSortF(array);
        System.out.println(Arrays.toString(array));

    }
}
