package practice;

public class CountIterative {

    private class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    /**
     * Use iteration. 
     * 10 -> 20 -> 30 -> null, result : 3
     * @param head
     * @return count.
     */
    public int countIterative(Node head) {
        int count = 0;
        if (head != null) {
            Node curr = head;          
            while (curr != null) {
                curr = curr.next;
                count++;
            }
        }
        
        return count;
    }
    
    /**
     * Use recursion.
     */
    public int countRecursive(Node head) {
        //base case
        if (head == null) {
            return 0;
        }
        
        //recursive step
        return 1 + countRecursive(head.next);       
    }
}
