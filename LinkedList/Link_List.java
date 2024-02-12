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

    public void printList() {
        Node currNode = Head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println(); // Print a newline after printing all elements
    }
    

  




    public static void main(String[] args) {
    Link_List list1 = new Link_List();
            list1.addNodeLast(10);
            list1.addNodeLast(20);
            list1.addNodeLast(30);
            list1.addNodeLast(40);
            // list1.addNodeFirst(5);

            list1.addNodeAtIndex(15, 10);

            list1.printList();
    

    }
    
}
