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
 };

 *****************************************************************/

 public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        int len = size(head);
        k = k % len;
        int count = len - k;
        Node last = head, prev = head;
        while (last.next != null) {
            last = last.next;
        }
        while (count-->1) {
            prev = prev.next;
        }
        last.next = head;
        head = prev.next;
        prev.next = null;
        return head;
    }

    private static int size(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}