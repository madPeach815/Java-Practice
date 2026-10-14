package practice;

public class GetLast {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * return the data from the last Node.
     * We assume that the list is not null.
     * 5 -> 8 -> 12 -> null, result : 12
     * 
     * @param head
     * @return
     */
    public int getLastIterative(Node head) {

        if (head.next == null) {
            return head.data;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        return curr.data;
    }
    
    public int getLastRecursive(Node head) {
        if (head.next == null) {
            return head.data;
        }
        
        return getLastRecursive(head.next);
    }
}
