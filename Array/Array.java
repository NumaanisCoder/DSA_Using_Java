import java.util.Arrays;

public class Array {
    private int length;
    int[] array;
    int currentIndex = 0;

    Array(int capacity){
        this.length = capacity;
        array = new int[length];
    }

    public void add(int data){
        if(currentIndex >= length){
            System.out.println("Array is full");
            return;
        }
        array[currentIndex] = data;
        currentIndex++;
    }

    public static void main(String[] args) {

        Array myArray = new Array(10);
        myArray.add(10);
        myArray.add(15);
        myArray.add(5);
        System.out.println(Arrays.toString(myArray.array));
    }
}
