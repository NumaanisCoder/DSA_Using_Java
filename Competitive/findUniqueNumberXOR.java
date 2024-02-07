public class findUniqueNumberXOR {

    static int getUniqueNumber(int[] arr){
        int uniqueNumber = 0;
        for (int i : arr) {
            uniqueNumber ^= i;
        }
        return uniqueNumber;
    }
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6,2,3,5,6};
        
        System.out.println(getUniqueNumber(array));
    }
}
