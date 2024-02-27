package linkedlist;

public class DoublyLL {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int x) {
            data = x;
            prev = null;
            next = null;
        }
    }


    Node insertAtBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;

        if (head != null){
            head.prev = temp;
        }
        return temp;
    }
    public static void main(String args[]) {
        Node head =  new Node(20);
        Node temp1 = new Node(30);
        Node temp2 = new Node(40);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

    }
}
