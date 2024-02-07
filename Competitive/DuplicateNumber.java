import java.util.HashSet;

class Solution {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        //  HashSet<Integer> duplicate = new HashSet<>();
        for(int number: nums){
            if(!unique.add(number)){
                    return number;
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4,3,2,5,4,1};
        System.out.println(findDuplicate(array));
    }
}