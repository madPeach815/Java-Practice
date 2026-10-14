package practice;

public class InsertSorted {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Insert newNode(val) in the right place and return the head.
     * 1 -> 3 -> 5 -> null, val = 4,result: 1 -> 3 -> 4 -> 5 -> null
     * 3 -> 5 -> null, val = 1, result : 1 -> 3 -> 5 -> null
     * If head == null, val < head.data 넣어야하는 value가 지금 head data보다 작으면
     *  make a newnode, newNode.next = head
     *  if val >= head.data(need to go more) head.next = 재귀. and return head. 
     */
    Node insertSorted(Node head, int val) {

        if (head == null || val < head.data) {
          Node newNode = new Node(val);
          newNode.next = head;
          return newNode;
        }
        
        head.next = insertSorted(head.next, val);
        return head;
    }
}
