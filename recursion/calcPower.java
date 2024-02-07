public class calcPower {

    public static int calculatePower(int num, int pow){
        if(num == 0){
            return 0;
        }else if(pow == 0){
            return 1;
        }
        if(pow % 2 == 0){
            return calculatePower(num, pow/2) * calculatePower(num, pow/2);
        }else{
            return calculatePower(num, pow/2) * calculatePower(num, pow/2) * num;
        }


    }
    public static void main(String[] args) {
        System.out.println(calculatePower(2, 5));
        
    }
    
}
