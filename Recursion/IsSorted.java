package practice;

public class IsSorted {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Check if the linked list is sorted in non-decreasing order
     * 1->2->2->4->null => true
     * 1->3->2->null => false
     * 
     * @param head the head of the list
     * @return true if the list is sorted, false otherwise.
     */
    public boolean isSorted(Node head) {

        // if head == null, as soon as I call head.next NullpointerException
        // will happen.
        if (head == null || head.next == null) {
            return true;
        }

        if (head.data <= head.next.data) {
            return isSorted(head.next);
        }
        
        return false;
    }

}
