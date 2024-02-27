package linkedlist;

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class searchInLinkedList {
    
    int searchLL(Node head, int x){
        if(head == null) return -1;

        Node curr = head;
        int pos = 1;

        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else{
                pos++;
                curr = curr.next;
            }
        }
      
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
