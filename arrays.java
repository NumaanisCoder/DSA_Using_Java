import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 32;
        arr[1] = 42;
        arr[2] = 56;
        arr[3] = 34;

        //defining by second method
        int[] arr2 = {3,4,5,6,2,5};


        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Search ");
        int no = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(no == arr[i]){
                System.out.println("Element Found At index "+i);
                break;
            }else if(i == arr.length){
                System.out.println("Element Not Found");
            }
        }
        sc.close();


    }
}
