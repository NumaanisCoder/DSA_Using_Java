

public class t1 {
    static class Pen{
        String name;
        String color;
        String type;
    
        void setName(String name){
            this.name = name;
        }
        String getName(){
            return name;
        }
        void write(){
            System.out.println("I am writing something with "+this.name+" pen of "+this.color+" of type "+type);
        }
    }
    public static void main(String[] args) {
        Pen p = new Pen();
        Pen p2 = new Pen();
       p.setName("Mohd. Arsh");
       p2.setName("Shavez Ghodi");
       System.out.println(p.getName());
       System.out.println(p2.getName());

    }
}

