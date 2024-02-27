package linkedlist;

public class circularLLImplementation {
    class Node {
        int data;
        Node next;

        Node (int x){
            data = x;
            next = null;
        }
    }

    void printCLL(Node head){
        if (head == null) {
            return;
        }
        System.out.print(head.data);
        for(Node i = head.next; i != head; i = i.next){
            System.out.print(" --> " + i.data);
        }
    }

    public static void main(String[] args) {
        circularLLImplementation cll = new circularLLImplementation();
    
        Node head = cll.new Node(10);
        head.next = cll.new Node(20);
        head.next.next = cll.new Node(30);

        head.next.next.next = head;

        cll.printCLL(head);


    }
}
