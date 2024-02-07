import java.util.HashSet;

public class HS_Basic {

    // static int generateNewUniqueArray(int arr[]){
    //      HashSet<Integer> hashSet = new HashSet<>();
    //       for(int num: arr){
    //         hashSet.add(num);
    //     }
    // }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        Integer arr[] = {1,1,2,3,3,4,5};
        System.out.println(arr);
        for(int num: arr){
            hashSet.add(num);
        }
        Integer[] uniqueArray = new Integer[hashSet.size()];
        hashSet.toArray(uniqueArray);

        // for(int num: uniqueArray){
        //     System.out.print(num+",");
        // }
        System.out.println(uniqueArray);
    }
    
}
