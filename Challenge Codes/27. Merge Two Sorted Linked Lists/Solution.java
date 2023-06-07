import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if (first == null)
            return second;
        if (second == null)
            return first;
        if (first.data <= second.data) {
            return merge(first, second);
        } else {
            return merge(second, first);
        }
	}
    private static LinkedListNode<Integer> merge(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2){

        if(l1.next == null){
            l1.next = l2;
            return l1;
        }

        LinkedListNode<Integer> curr1 = l1;
        LinkedListNode<Integer> next1 = curr1.next;
        LinkedListNode<Integer> curr2 = l2;
        LinkedListNode<Integer> next2 = curr2.next;


        while(next1 != null && curr2 != null){

            if(curr2.data >= curr1.data && curr2.data <= next1.data){
                curr1.next  =curr2;
                next2 = curr2.next;
                curr2.next = next1;

                curr1 = curr2;
                curr2 = next2;
            }else{

                curr1 = next1;
                next1 = next1.next;

                if(next1 == null){
                    curr1.next = curr2;
                    return l1;
                }
            }
        }
        return l1;
    }
}