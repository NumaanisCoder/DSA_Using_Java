public class jump {
    static int minJumps(int[] arr){
        // your code here
        int jump = 0;
        int i = 0;
        
        while(i < arr.length){
            int jumpValue = arr[i];
            i += jumpValue;
            jump++; 
            if(i >= arr.length-1){
                break;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int[] array ={1,4,2,7,3,2,1};
        System.out.println(minJumps(array));
        
    }
}
