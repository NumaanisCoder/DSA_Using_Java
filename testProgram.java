public class testProgram {
    public static void main(String[] args) {
        int x = 100;
        double y = 100.1;
        // boolean b = (x = y); Not working
         boolean b = (x == y);
        System.out.println(b);
    }
}
