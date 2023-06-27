import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
		LinkedListNode<Integer> newHead = cloneList(head), temp = head, cur = newHead;
		Map<LinkedListNode<Integer>, LinkedListNode<Integer>> map = new HashMap<>();
		while (temp != null) {
			map.put(temp, cur);
			temp = temp.next;
			cur = cur.next;
		}
		temp = head;
		cur = newHead;
		while (temp != null) {
			if (temp.random != null) {
				cur.random = map.get(temp.random);
			}
			temp = temp.next;
			cur = cur.next;
		}
		return newHead;
	}
	private static LinkedListNode<Integer> cloneList(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> dummy = new LinkedListNode<>(0), cur = dummy;
		LinkedListNode<Integer> temp = head;

		while (temp != null) {
			cur.next = new LinkedListNode<>(temp.data);
			temp = temp.next;
			cur = cur.next;
		}

		return dummy.next;
	}
}
