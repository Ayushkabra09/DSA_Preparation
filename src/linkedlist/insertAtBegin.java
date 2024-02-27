package linkedlist;
// class Node{
//     int data;
//     Node next;

//     Node (int x){
//         data = x;
//         next = null;
//     }
// }
public class insertAtBegin {

    static Node insertAtBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head,30);
        head = insertAtBegin(head,20);
        head = insertAtBegin(head,10);
  
    } 
}


