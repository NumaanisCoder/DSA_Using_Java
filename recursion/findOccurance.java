public class findOccurance {
    public static int firstOccurance  = -1;
    public static int LastOccurance  = -1;

    public static void findOccuranceFunc(String str, int index, char element){
        if(str.length() == index){
            System.out.println("First Occurance "+firstOccurance);
            System.out.println("Last Occurance "+LastOccurance);
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar == element){
            if(firstOccurance == -1){
                firstOccurance = index;
            }else{
                LastOccurance = index;
            }
        }
       findOccuranceFunc(str, index+1, element);
    }


    public static void main(String[] args) {
        String str = "a";
       findOccuranceFunc(str, 0, 'a');
    }
}
