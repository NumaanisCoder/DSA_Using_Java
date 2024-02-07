    public class removeDuplicate {

      static int removeDuplicateFunc(int arr[]){
            int j = 1;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] != arr[i-1]){
                    arr[j] = arr[i];
                    j++;
                }
            }
            return j;
        }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,5};
        int lengthofNewArray = removeDuplicateFunc(arr);
        System.out.println(lengthofNewArray);
        
    }
}
