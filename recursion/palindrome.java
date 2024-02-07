import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        int num, rev = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        int temp = num;
        while(temp!= 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if(num == rev){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
}