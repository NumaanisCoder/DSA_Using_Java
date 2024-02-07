public class reverseArray {

    static void reverseArrayFunc(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};
        reverseArrayFunc(arr);
        for(int num: arr){
            System.out.print(num);
        }
    }
}
