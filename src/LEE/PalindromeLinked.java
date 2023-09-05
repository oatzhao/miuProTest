package LEE;

public class PalindromeLinked {
    public static boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode slow=head, fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        slow.next=null;
        right=reverse(right);
        ListNode left=head;
        while(right!=null){
            if(left.val!=right.val){
                System.out.println(left.val);
                System.out.println(right.val);
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }
}
