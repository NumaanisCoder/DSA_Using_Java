
public class LinkList {
    Node head;
    private int size;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    LinkList(){
        this.size = 0;
    }

    // Add
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Add at LAST
    public void addLast(String data){
         Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curretNode = head;
        while(curretNode.next != null ){
            curretNode = curretNode.next;
        }
        curretNode.next = newNode;
        
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!= null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //print list
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void getSize(){
        System.out.println(size);
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    

    public static void main(String[] args) {
        LinkList LL = new LinkList();
        //adding
        LL.addFirst("DOKIE");
        LL.addFirst("OK");
        LL.addLast("Ghost");
        LL.printList();
        LL.head = LL.reverseRecursion(LL.head);
        LL.printList();
    
        

    }

}
