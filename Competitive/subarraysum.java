import java.util.ArrayList;

public class subarraysum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        int left = 0;
        int right = 0;
        
        while (right < arr.length) {
            sum += arr[right];
            
            while (sum > s) {
                sum -= arr[left];
                left++;
            }
            
            if (sum == s) {
                result.add(left + 1); // Add 1 to convert from 0-based index to 1-based index
                result.add(right + 1); // Add 1 to convert from 0-based index to 1-based index
                return result;
            }
            
            right++;
        }
        
        // If no subarray is found, add -1 to the result list
        result.add(-1);
        return result;
    }
    

    public static void main(String[] args) {
        int[] array = {4,7,8,9,3};
        
        System.out.println(subarraySum(array, array.length, 24));
    }
}
