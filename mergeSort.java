public class mergeSort {

    public static void mergeSortfunc(int arr[], int lower, int higher){
        if(lower<higher){
            int mid = (lower + higher) / 2;
            mergeSortfunc(arr, lower, mid);
            mergeSortfunc(arr, mid+1, higher);
            merge(arr, lower, mid, higher);
            
        }
    }
    public static void merge(int A[], int low, int mid, int high)
{
    int i, j, k;
    int[] B = new int[20];
    i = low;
    j = mid + 1;
    k = low;

    while (i <= mid && j <= high)
    {
        if (A[i] < A[j])
        {
            B[k] = A[i];
            i++;
            k++;
        }
        else
        {
            B[k] = A[j];
            j++;
            k++;
        }
    }
    while (i <= mid)
    {
        B[k] = A[i];
        k++;
        i++;
    }
    while (j <= high)
    {
        B[k] = A[j];
        k++;
        j++;
    }
    for (int p = low; p <= high; p++)
    {
        A[p] = B[p];
    }
}


    public static void main(String[] args) {
        int arr[] = {6,9,2,1,3};
        mergeSortfunc(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+",");
        }
        
    }
    
}
