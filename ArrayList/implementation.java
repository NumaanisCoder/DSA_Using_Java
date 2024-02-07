import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;


public class implementation {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //add

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(1);

        //Modify

        list.add(2,2);
        list.set(1,10);


        //delete

        list.remove(0);

         System.out.println(list);

        Collections.sort(list);
        //Display
        System.out.println(list);
    }
    
}
