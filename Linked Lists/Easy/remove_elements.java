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
    public ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return head;

        ListNode dummy = head;

        while (dummy != null && dummy.val == val) {

            dummy = dummy.next;
        }

        if (dummy == null)
            return null;

        head = dummy;

        while (dummy != null && dummy.next != null) {

            if (dummy.next.val == val)
                dummy.next = dummy.next.next;

            else
                dummy = dummy.next;
        }

        return head;
    }
}