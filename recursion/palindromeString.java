public class palindromeString {
    public static String reverseString(String str){
        if(str.length() == 1){
            return str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
    }

    public static boolean palindromeCheck(String a){
        String rev = reverseString(a);
        return rev.equals(a);
    }



    public static void main(String[] args) {
        String a = "ili";
        System.out.println(palindromeCheck(a));
    }
}
