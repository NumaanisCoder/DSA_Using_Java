public class index {

    public static void main(String[] args) {
        String a = "RelaxByte";  // It is storing in the string pool
        String b  = new String("RelaxByte"); // it is creating new object in heap memory
        System.out.println(a == b);
    }
    
}
