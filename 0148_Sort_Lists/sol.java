//  Definition for singly-linked list.

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

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode lsh = sortList(head);
        ListNode rsh = sortList(slow);

        return mergeLists(lsh, rsh);
    }

    public ListNode mergeLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(-1);
        ListNode dummy = node;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {

                ListNode temp = new ListNode(l1.val);
                node.next = temp;
                node = node.next;
                l1 = l1.next;
            }

            else {

                ListNode temp = new ListNode(l2.val);
                node.next = temp;
                node = node.next;
                l2 = l2.next;
            }
        }

        while (l1 != null) {

            ListNode temp = new ListNode(l1.val);
            node.next = temp;
            node = node.next;
            l1 = l1.next;
        }

        while (l2 != null) {

            ListNode temp = new ListNode(l2.val);
            node.next = temp;
            node = node.next;
            l2 = l2.next;
        }

        return dummy.next;
    }
}