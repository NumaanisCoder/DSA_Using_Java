public class sentencePalindrome {
    public static String reverseString(String s){
        if(s.length() == 1){
            return s;
        }
        return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[\\s\\p{P}]", "").toLowerCase();
        String rev = reverseString(s);
        return s.equals(rev);    
    }
    public static void main(String[] args) {
        String str = "`l;`` 1o1 ??;l`";
        str.replaceAll("[\\s\\p{P}]", "").toLowerCase();
        String rev = reverseString(str);
        System.out.println(str);
        System.out.println(rev);
    }
}
