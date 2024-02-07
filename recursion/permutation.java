public class permutation {
    public static void printPer(String string, String permutation){
        if(string.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < string.length(); i++){
            char currChar = string.charAt(i);
            String newString = string.substring(0, i) + string.substring(i+1);
            printPer(newString, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPer(str, "");
  


    }
}
