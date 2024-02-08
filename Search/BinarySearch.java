public class BinarySearch {

    static int BinarySearchFunc(int arr[], int element){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;

        while (start <= end) {
            if(arr[mid]== element){
                return mid;
            }

            if(element > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println("Index of 2: "+ BinarySearchFunc(array, 2));
    }
    
}
