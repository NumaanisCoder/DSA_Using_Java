public class findingMissingNumber {

    public static void main(String[] args) {
     int[] array = {1,2,3,4,0,5};
    int n = array.length;
    int total = n * (n+1) / 2;
    int sum = 0;
    for(int number: array){
        sum += number;
    }
    int MissingNumber = total-sum;

    System.out.println("Missing Number is : "+MissingNumber);
    }
    
}
