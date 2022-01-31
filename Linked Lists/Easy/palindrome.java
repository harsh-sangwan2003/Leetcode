/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private static ListNode left;

    private boolean helper(ListNode right) {

        if (right == null)
            return true;

        boolean rres = helper(right.next);

        if (rres && left.val == right.val) {
            left = left.next;
            return true;
        }

        else {

            return false;
        }
    }

    public boolean isPalindrome(ListNode head) {

        left = head;

        return helper(head);
    }
}