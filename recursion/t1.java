public class t1 {

    public static void printNumb(int n){
        if(n == 0){
            return;
        }
        System.out.println(6-n);
        printNumb(n);
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sumOfDigit(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
        int lastDigit = n % 10;
        int remainingDigit = n / 10;
        return lastDigit + sumOfDigit(remainingDigit);
    }

    public static void main(String[] args) {
        int n = 53;
        System.out.println(sumOfDigit(n));

        // printNumb(n);
        // System.out.println(factorial(n));
        // System.out.println(fibonacci(5));
        // System.out.println(sumOfDigit(10));
    }
    
}
