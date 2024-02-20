

public class kadane {

    public static long maxSubarraySum(int arr[], int n){
        
        long maxSoFar = arr[0];
        long maxEndingHere = arr[0];
        
        for (int i = 1; i < arr.length; i++) {


        //Update
        System.out.println("Loop "+i);
            maxEndingHere += arr[i];
            System.out.println(maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            System.out.println(maxSoFar);
    
        }
        
        return maxSoFar;
            
        }

    public static void main(String[] args) {
        int[] array = {1,2,3,-5,4};
      maxSubarraySum(array, array.length);
    }
    
}
