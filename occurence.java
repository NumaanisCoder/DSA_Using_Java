public class occurence {

    static int occurenceCount(int arr[], int value){
        int count = 0;
        for(int i = 0; i <= arr.length-1; i++){
            if(value == arr[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,3,12,3,2,3};
        System.out.println(arr.length);
        System.out.println(occurenceCount(arr, 3));
    }
}
