/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node fast = head;
        Node slow = head;
        Node temp = head;
        boolean cycleFound = false;
        while (fast != null && fast.next!=null) {
            if (!cycleFound) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast==slow) cycleFound = true;
            } else {
                if (temp==fast) return temp;
                temp = temp.next;
                fast = fast.next;
            }
        }
        return null;
    }
}