public class reverseString {

    public static void reverseStringFunc(String str, int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseStringFunc(str, index-1);
    }
    public static void main(String[] args) {
        String name = "Numaan";
        reverseStringFunc(name, name.length()-1 );
    }
}
