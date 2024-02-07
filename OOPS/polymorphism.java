class Animal {
        int legs = 4;
        int tail = 1;

        public void makeNoise(){
            System.out.println("Animal is making noise");
        }
    }
class Dog extends Animal{

    public void makeNoise(){
        System.out.println("BAOH BAOH");
    }
}

class Adder{
    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public void add(int num1, int num2, int num3, int num4){
        System.out.println(num1+num2+num3+num4);
    }
}
class Calculator extends Adder{

}

public class polymorphism{
    
    public static void main(String[] args) {
        // Animal a = new Dog();
        // a.makeNoise();
        Adder a1= new Adder();
        a1.add(1,2,4,6);
        
    }
}