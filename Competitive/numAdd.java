//Two Sum

// [2,4,5,6,7] , target = 6
// 2+4 = 6, true, but we have return the indexes of both of them as a array
// return [0,1]

public class numAdd {

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;

                }
            }

        }
        return output;
    }

    public static void main(String[] args) {
        int array[] = {11,22,93,7,5,6};

        for (int i : twoSum(array, 100)) {
            System.out.println(i);
        }

    }

}
