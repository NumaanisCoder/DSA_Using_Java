public class queueUsingArray{
    static class Queue{
        static int arr[];
        int size;
        static int rear = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public void traverse(){
            for(int i = 0; i <= rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public boolean isEmpty(){
            return rear == -1;
        }
        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.traverse();

        queue.remove();
        queue.remove();
        queue.traverse();

        queue.add(5);
        queue.add(6);

        queue.traverse();
    }
}