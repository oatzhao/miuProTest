package LEE;

import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next=next;}
}

public class TwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;

            int sum=val1 + val2+ carry;
            ListNode newNode = new ListNode(sum%10);
            carry=sum/10;

            tail.next=newNode;
            tail=tail.next;

            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return head.next;
    }

    public static void main(String[] args) {
    }
}
