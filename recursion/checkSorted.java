public class checkSorted {

public static boolean checkSortedFunc(int arr[], int index){

    if(index == arr.length-1){
        return true;
    }
    if(arr[index] <= arr[index+1]){
        return checkSortedFunc(arr, index+1);
    }else{
        return false;
    }
    
}

    public static void main(String[] args) {
      int array[] = {1,3,4,2,5,6};
      System.out.println(checkSortedFunc(array, 0));
    }
    
}
