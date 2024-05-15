
public class Link_List {

    private Node Head;
    int size;

    class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Link_List(){
        this.size = 0;
    }




    public void addNodeLast(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head = newNode;
        }else{
            Node currNode = Head;
              //KHISKAO
            while (currNode.next != null) {
                currNode = currNode.next;
            }
    
            currNode.next = newNode;
        }
    }

    public void addNodeAtIndex(int data, int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        else if( index == 0){
            Node newNode = new Node(data);
            newNode.next = Head;
            Head = newNode;
            return;
        }
        
        Node currNode = Head; // Assuming head is accessible
        int i = 0;
    
        while (i < index - 1 && currNode != null) {
            currNode = currNode.next;
            i++;
        }
    
        if (currNode == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    
        Node newNode = new Node(data);
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    

    public void addNodeFirst(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head = newNode;
        }else{
            newNode.next = Head;
            Head = newNode;
        }
    }

    //Delete At Last
    public void deleteLast(){
        if(Head == null){
            System.out.println("List is Empty");
            return;
        }else if(Head.next == null){
            Head = null;
            return;
        }
        size--;
        Node secondLast = Head;
        Node Last = Head.next;

        while (Last.next != null) {
            secondLast = secondLast.next;
            Last = Last.next;
        }
        secondLast.next =  null;

    }
    //Delete At First
    public void deleteFirst(){
        if(Head == null){
            System.out.println("List is Empty");
            return;
        }else if(Head.next == null){
            Head = null;
            return;
        }
        Head = Head.next; 
        
    }

    //Delete At Index
    public void deleteAtIndex(int index){
        if(Head == null){
            System.out.println("List is Empty");
            return;
        } else if(Head.next == null || index == 0){
            Head = null;
            return;
        }
    
        Node currNode = Head;
        int i = 0;
    
        while (i < index - 1 && currNode.next != null) {
            currNode = currNode.next;
            i++;
        }
        if (currNode.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        currNode.next = currNode.next.next;
    }
  
    

    public void printList() {
        Node currNode = Head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println(); // Print a newline after printing all elements
    }

    public void reverseIterate(){
        Node prevNode = Head;
        Node currNode = Head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        Head.next =null;
        Head = prevNode;

    }

    public Node reverseRecursion(Node head){
        if(head.next == null || head == null){
            return head;
        }
        Node newHead = reverseRecursion(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
    

    public Boolean isPalindrome(Node head){

            

    }
  




    public static void main(String[] args) {
    Link_List list1 = new Link_List();
            list1.addNodeLast(10);
            list1.addNodeLast(20);
            list1.addNodeLast(30);
            list1.addNodeLast(40);

            // System.out.println("After Deleting..");
            list1.addNodeAtIndex(5,0);
            
            list1.printList();
            list1.Head = list1.reverseRecursion(list1.Head);
            list1.printList();
  
    
    

    }
    
}
