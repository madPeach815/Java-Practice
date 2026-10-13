package practice;

public class InsertAtEnd {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 1 -> 2 -> null. val : 3, 1 -> 2 -> 3 -> null
     * head == null ? make new Node and return.
     * if not, head.next = recursive next.
     * 
     * @param head
     * @param val
     * @return First Node from the list that added new Node.
     */
    Node insertAtEnd(Node head, int val) {

        if (head == null) {
            return new Node(val);
        }
        
        head.next = insertAtEnd(head.next, val);
        
        return head;
    }
}
