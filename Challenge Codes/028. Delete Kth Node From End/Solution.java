/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

 public class Solution
 {
     public static Node removeKthNode(Node head, int k)
     {
         // Write your code here.
         int len = size(head);
         if (k==len) return head.next;
         int cnt = len - k - 1;
         Node temp = head;
         while (cnt-->0) {
             temp = temp.next;
         }
         temp.next = temp.next.next;
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