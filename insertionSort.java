

public class insertionSort {
    public static void main(String[] args){


        int[] arr = {3,2,4,1,5,6};


        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            System.out.println("Iteration :"+i);
            System.out.println("Current :" + current);
            int j = i - 1;
            System.out.println("j :"+j);
            while(j>= 0 && current < arr[j]){
                System.out.println("Array[j+1]: "+arr[j+1]);
                System.out.println("Array[j]: "+arr[j]);
                
                arr[j+1] = arr[j];
System.out.println("Array[j+1]: "+arr[j+1]);
                j--;
            }
            System.out.println("After While loop j :"+j);
            System.out.println("Array[j+1]: "+arr[j+1]);
            arr[j+1] = current;
            
// for(int k = 0; i < arr.length-1; k++){
//     System.out.print(arr[k]);
// }
            System.out.println();
        }


    }
}
