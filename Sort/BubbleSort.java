import java.util.Arrays;

public class BubbleSort {

    static void BubbleSortFunc(int[] array){
        for(int i = 0; i < array.length-1; i++ ){
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp  =array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] array = { 3,2,4,1,6,5,6,3,3,1,5,3,2,1,4,2,4,4,2,23,324,24,5,53,232,32,23,4,6,5,7,44,453,344,546,56576,64,22,234,54};
        BubbleSortFunc(array);
        System.out.println(Arrays.toString(array));
        
    }
}
