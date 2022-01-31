/**
 * Definition for singly-linked list.
 * public class ListNode {
 * val;
 * Node next;
 * Node(int x) {
 * 
 * ull;
 * 
 * }
 */
class Solution {

    private int findSize(ListNode head) {

        int size = 0;

        while (head != null) {

            size++;
            head = head.next;
        }

        return size;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode n1 = headA;
        ListNode n2 = headB;

        int s1 = findSize(n1);
        int s2 = findSize(n2);

        int delta = Math.abs(s1 - s2);

        if (s1 > s2) {

            for (int i = 0; i < delta; i++)
                n1 = n1.next;
        }

        else if (s2 > s1) {

            for (int i = 0; i < delta; i++)
                n2 = n2.next;
        }

        while (n1 != null && n2 != null) {

            if (n1 == n2)
                return n2;

            n1 = n1.next;
            n2 = n2.next;
        }

        return null;
    }
}