import java.util.Arrays;

public class SelectionSort {
    
    static void SelectionSortFunc(int[] array){


        for(int i = 0; i < array.length-1; i++){
            int minIndex  = i; 
            // Index I is pointer 1
            // Index J is pointer 2

            for(int j= i+1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;   //Updating minIndex if array[j] is smaller than array[minIndex]
                }
            }

            //SWAP
            int temp  = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

           System.out.println("Array after "+ i + " loop :"+Arrays.toString(array)); 
        }
    }




    public static void main(String[] args) {
        int[] myArray = {7,8,5,3,1};
        SelectionSortFunc(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
