public class towerOfHanoi {

    public static void TowerOfHanoi(int disc, String source, String helper, String Destination){
        if(disc == 1){
             System.out.println("Transfer disk "+disc+" from "+source+" to Destination "+Destination);
             return;
        }
        TowerOfHanoi(disc-1, source,Destination, helper);
        System.out.println("Transfer disk "+disc+" from "+source+" to Destination "+Destination);
        TowerOfHanoi(disc-1, helper, Destination, source);

    }


    public static void main(String[] args) {
        int i = 2;
        TowerOfHanoi(i, "A", "B", "C");
        
    }
    
}
