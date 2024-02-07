import java.util.HashMap;;

public class HM_Basic {
    public static void main(String[] args) {
        HashMap<String, String> Map = new HashMap<>();
        HashMap<Integer, String> Map2 = new HashMap<>();

        // if the key is in not integer type , it will give random order when iterate
        Map.put("India", "Numaan");
        Map.put("China", "Numaan");
        Map.put("Brazil", "Numaan");

    


        // if the key is in  integer type , it will give ordered when iterate
        Map2.put(2, "Nabeel");
        Map2.put(1, "Numaan");
        Map2.put(3, "Naeem");

        System.out.println(Map2);


        System.out.println(Map2.containsKey(2)); // true
        System.out.println(Map.containsKey(2)); //false

        System.out.println(Map.containsValue("Nabeel"));
        System.out.println(Map2.containsValue("Nabeel"));

        for (HashMap.Entry<Integer, String> ele: Map2.entrySet()) {
            System.out.println(ele.getKey());
        }
        
    }
}
