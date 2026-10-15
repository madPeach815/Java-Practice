package practice;

public class CopyList {
    private class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }
    
    /**
     * Creates a deep copy of the given linked list.
     * @param head the head of the original list
     * @return the head of the newly created copied list
     */
    public Node copyList(Node head) {
               
        if (head == null) {
            return null;
        }
        
        Node newNode = new Node(head.data);
        
        newNode.next = copyList(head.next);
        
        return newNode;
    }
}
