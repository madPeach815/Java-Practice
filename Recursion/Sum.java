package practice;

public class Sum {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        /**
         * sum(Node head)
         * this is a simple problem that adds all data and return it.
         * You need to use recursion.
         * 3 -> 5 -> 2 -> null
         * result : 10
         * think about base case and how to combine the current node's data
         * with the rest.
         */

        public int sum(Node head) {

            // base case
            if (head == null) {
                return 0;
            }

            return head.data + sum(head.next);
        }

    }
}
