package practice;

public class FilterEvens {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Creates a new linked list containing only the even values from the
     * original list.
     * 1 -> 2 -> 3 -> 4 -> 5 -> null => return 2 -> 4 -> null
     * 
     * @param head the head of the original list
     * @return the head of the newly created list with only even elements.
     */
    Node filterEvens(Node head) {
        if (head == null) {
            return null;
        }
        Node newNode;

        if (head.data % 2 == 0) {
            newNode = new Node(head.data);
            newNode.next = filterEvens(head.next);
        } else {
            newNode = filterEvens(head.next);
        }

        return newNode;
    }
}
