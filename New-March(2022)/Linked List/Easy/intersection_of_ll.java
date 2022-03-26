//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public int size(ListNode node) {

        int count = 0;

        while (node != null) {

            count++;
            node = node.next;
        }

        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int len1 = size(headA);
        int len2 = size(headB);

        int delta = Math.abs(len1 - len2);

        if (len1 > len2) {

            for (int i = 0; i < delta; i++)
                headA = headA.next;
        }

        else {

            for (int i = 0; i < delta; i++)
                headB = headB.next;
        }

        while (headA != null) {

            if (headA == headB)
                return headA;

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}