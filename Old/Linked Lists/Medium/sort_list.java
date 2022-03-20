// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return mergeList(left, right);
    }

    public ListNode mergeList(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(-1);
        ListNode temp = node;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {

                temp.next = l1;
                l1 = l1.next;
            }

            else {

                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if (l1 != null)
            temp.next = l1;

        if (l2 != null)
            temp.next = l2;

        return node.next;
    }
}