package practice;

public class Contains {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 1 -> 4 -> 9 -> null, target = 4 -> true
     * Think about what to return if you reach the end without finding the
     * target.
     * What should you return if the current node's data is same as target.
     * 
     * @param head
     * @param target
     * @return true if an element matches the target value; otherwise, false.
     */
    boolean contains(Node head, int target) {

        if (head == null) {
            return false;
        }

        if (head.data == target) {
            return true;
        } else {
            return contains(head.next, target);
        }
    }
}
