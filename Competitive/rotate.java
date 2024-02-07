public class rotate {
    static void rotateOne(int arr[]){
        int temp = arr[arr.length-1];

        for(int i = 1; i < arr.length-1; i++){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7};
        rotateOne(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
