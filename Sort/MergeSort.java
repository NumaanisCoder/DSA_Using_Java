import java.util.Arrays;

public class MergeSort {


    static void Merge(int[] array, int low, int mid, int high){
        int[] tempArray = new int[high-low+1];

        int i = low;
        int j = mid+1;
        int k = 0;


        while (i<= mid && j <= high) {
            if (array[i] <= array[j]) {
                tempArray[k] = array[i]; //left array ka element daala
                i++;
            }else{
                tempArray[k] = array[j]; //right array ka element daala
                j++;
            }
            k++;
        }

        while (i <= mid) {
            tempArray[k] = array[i];  //LEFT KE JO BACHE HA DAALDO
            i++;
            k++;    
        }
        while (j <= high) {
            tempArray[k] = array[j]; //RIGHT KE JO BACHE HA DAALDO
            j++;
            k++;    
        }

     // Copy elements from tempArray back to array
     for (i = 0; i < tempArray.length; i++) {
        array[low + i] = tempArray[i]; // Use low + i as index for array
    }


    }

    static void MergeSortFunction(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            MergeSortFunction(array, low, mid); // left
            MergeSortFunction(array, mid + 1, high); // right

            Merge(array, low, mid, high); // it will consider both arrays are sorted and it will merge them in sorted
                                          // order

        }
    }

    public static void main(String[] args) {
            int[] array = {2,5,2,2,1};
            MergeSortFunction(array, 0, array.length-1);
            System.out.println(Arrays.toString(array));
    }
}