import java.util.Arrays;

public class SortArray 
{ 
    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        while( i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k] = left[i];
                k++;
                i++;
            }else{
                result[k] = right[j];
                j++;
                k++;
            }
        }
        
        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
    public static int[] sortArr(int[] arr, int n) 
    { 
       if(n <= 1){
           return arr;
       }
       
       int mid = n/2;
       
       int[] left = new int[mid];
       int[] right = new int[n-mid];
       
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n-mid);
       
        left = sortArr(left, mid);
        right = sortArr(right, n - mid);
       
       return merge(left, right);
       
    }

    public static void main(String[] args) {
        int[] array = {5,3,6,2,9};
        sortArr(array, array.length);
        System.out.println(Arrays.toString(array));
    }
} 