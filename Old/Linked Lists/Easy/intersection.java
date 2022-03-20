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

    public int findLength(ListNode node) {

        int len = 0;

        while (node != null) {

            node = node.next;
            len++;
        }

        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int s1 = findLength(headA);
        int s2 = findLength(headB);

        int delta = Math.abs(s1 - s2);

        if (s1 > s2) {

            for (int i = 0; i < delta; i++)
                headA = headA.next;
        }

        else if (s2 > s1) {

            for (int i = 0; i < delta; i++)
                headB = headB.next;
        }

        while (headA != null && headB != null) {

            if (headA == headB)
                return headA;

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}