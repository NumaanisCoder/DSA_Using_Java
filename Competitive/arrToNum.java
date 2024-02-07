public class arrToNum {
    public static int number(int[] arr){
        int num;
        int i = 0;
        do{
            int c = arr[i];
            num = c*10 + arr[i+1];
            i++;
        }while(i < arr.length-1);

        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(number(arr));
    }


}
