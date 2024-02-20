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

       hashSet.add(10);
       hashSet.add(10);
       hashSet.add(20);
       System.out.println(hashSet);
       hashSet.remove(10);
       System.out.println(hashSet);
    }
    
}
