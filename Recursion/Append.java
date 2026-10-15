package practice;

public class Append {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * append head2 list after head1 list.
     * head1 : 1 -> 2 -> null
     * head2 : 3 -> 4 -> null
     * => 1 -> 2 -> 3 -> 4 -> null
     * 
     * @param head1
     * @param head2
     * @return
     */
    public Node append(Node head1, Node head2) {
       if (head1 == null) {
           return head2;
       }
       
       Node curr = head1;
       while (curr.next != null) {
           curr = curr.next;
       }
       curr.next = head2;
       
       return head1;
    }

    public Node append2(Node head1, Node head2) {

        /**
         * head1 : 1 -> 2 -> null
         * head2 : 3 -> 4 -> null
         * => 1 -> 2 -> 3 -> 4 -> null
         * It starts with append(1, 3), if head1 is null, we can just return
         * head2.
         * append(1, 3)
         * 1(head1).next = append(2, 3) pause
         * append(2, 3) : 2 != null so 2(head1).next = append(null, 3)
         * append(null, 3) head1 == null so return head2 which is 3 (-> 4 ->
         * null)
         * 
         * now we go back and return head1
         * append(null, 3)  2.next = 3 -> 4 -> null
         * append(2, 3) 1.next = 2 -> 3 -> 4 -> null
         * append(1, 3) return head1 which is 1.
         * so 1 -> 2 -> 3 -> 4 -> null
         */

        if (head1 == null) {
            return head2;
        }

        head1.next = append(head1.next, head2);

        return head1;
    }
}
