public class StackUsingArray {

     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }



     class Stack{
        public  Node Head = null;

        public  void push(int data){
            Node newNode = new Node(data);
            
            if(Head == null){
                Head = newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;

        }

        public  boolean isEmpty(){
            return Head == null;
        }

        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = Head;
            Head = Head.next;
            return top.data;
        }

        public  int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = Head;
            return top.data;
        }



       

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(15);
        stack.push(30);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    
}
