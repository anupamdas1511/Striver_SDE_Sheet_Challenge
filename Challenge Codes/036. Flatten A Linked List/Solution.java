/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node flattenLinkedList(Node root) {
        //Write your code here
        if (root == null || root.next == null)
            return root;
 
        // recur for list on right
        root.next = flattenLinkedList(root.next);
 
        // now merge
        root = merge(root, root.next);
 
        // return the root
        // it will be in turn merged with its left
        return root;
    }


    private static Node merge(Node a, Node b) {
        // if first linked list is empty then second
        // is the answer
        if (a == null)
            return b;
 
        // if second linked list is empty then first
        // is the result
        if (b == null)
            return a;
 
        // compare the data members of the two linked lists
        // and put the larger one in the result
        Node result;
 
        if (a.data < b.data) {
            result = a;
            result.child = merge(a.child, b);
        }
 
        else {
            result = b;
            result.child = merge(a, b.child);
        }
 
        result.next = null;
        return result;
    }
}