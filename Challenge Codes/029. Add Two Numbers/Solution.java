import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    public static int sum(LinkedListNode head1, LinkedListNode head2){
        if(head1==null){
            return head2.data;
        }
        if(head2==null){
            return head1.data;
        }
        return head1.data+head2.data;
    }
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode n1=new LinkedListNode(0);
        LinkedListNode ret=n1;
        int carry=0;
        while(head1!=null || head2!=null){
            int a=sum(head1,head2)+carry;
            carry=a/10;
            n1.data=a%10;
            if(head1!=null){
                head1=head1.next;
            }
            if(head2!=null){
                head2=head2.next;
            }
            if(head1!=null || head2!=null){
            LinkedListNode temp=new LinkedListNode(0);
                n1.next=temp;
                n1=n1.next;
            }
        }
        if(carry!=0){
        LinkedListNode temp=new LinkedListNode(carry);
            n1.next=temp;
        }
        return ret; 
    }
}