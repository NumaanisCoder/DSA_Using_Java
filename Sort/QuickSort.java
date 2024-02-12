import java.util.Arrays;

public class QuickSort {


    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;


        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    

    static void Quick(int arr[], int low, int high){
        if(low < high){
            int pidx = partition(arr,low,high); //pivot
            Quick(arr,low,pidx-1); //left
            Quick(arr, pidx, high); //right
        }
    }


    public static void main(String[] args) {

        int[] arr = {5,3,6,1,4};
        int n = arr.length;

        Quick(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
        
    }
}
