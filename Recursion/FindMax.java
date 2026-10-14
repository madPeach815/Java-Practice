package practice;

public class FindMax {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Returns the max value from the list.
     * Assumes the list is not null;
     * 7 -> 2-> 15 -> 4 -> null, result : 15
     * 
     * @param head
     * @return
     */
    public int findMaxIterative(Node head) {
        int max = head.data;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data > max) {
                max = curr.data;
            }
            curr = curr.next;
        }

        return max;

    }

    public int findMaxRecursive(Node head) {
        return findMaxRecursive(head, head.data);
    }

    private int findMaxRecursive(Node head, int max) {
        
        if (head == null) {
            return max;
        }
        
        if (head.data > max) {
            max = head.data;
            return findMaxRecursive(head.next, max);
        } else {
            return findMaxRecursive(head.next, max);
        }
    }
    
    public int findMaxRecursion2(Node head) {
        if (head.next == null) {
            return head.data;
        }
        
        return Math.max(head.data, findMaxRecursion2(head.next));
    }

}
