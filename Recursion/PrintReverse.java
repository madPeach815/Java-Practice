package practice;

public class PrintReverse {
    private class Node{
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    /**
     * Prints the list elements in reverse order. 
     * if list is 1->2->3->null, print 3 2 1
     * @param head
     */
    public void printReverse(Node head) {
        
        if (head == null) {
            return;
        }
        printReverse(head.next);
        System.out.println(head.data);
    }
}
