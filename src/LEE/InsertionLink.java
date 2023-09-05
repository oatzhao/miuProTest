package LEE;

import LEE.ListNode;

public class InsertionLink {
    static ListNode nhead;
    public static ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur != null) {
            insert(cur.val);
            cur = cur.next;
        }
        return nhead;
    }

    public static void insert(int val) {
        ListNode node=new ListNode(val);
        if (nhead == null || nhead.val >= node.val) {
            node.next = nhead;
            nhead = node;
            return;
        }
        ListNode curr = nhead;
        while (curr.next != null && curr.next.val < node.val) {
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
    }

    public static void main(String[] args) {
        // Creating linked list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode sortedHead = insertionSortList(head);

        // Printing sorted linked list: 1 -> 2 -> 3 -> 4
        while (sortedHead != null) {
            System.out.print(sortedHead.val + " ");
            sortedHead = sortedHead.next;
        }


    }
}

