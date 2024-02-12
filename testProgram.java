public class testProgram {

    static void changeValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        // int x = 100;
        // double y = 100.1;
        // // boolean b = (x = y); Not working
        //  boolean b = (x == y);
        // System.out.println(b);

        int b = 10;
        int c = 20;
        changeValue(b, c);

        System.out.println(b);
        System.out.println(c);



    }
}
