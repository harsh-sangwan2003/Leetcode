//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    private static ListNode left;

    public boolean isPalindrome(ListNode head) {

        left = head;
        return helper(head);
    }

    public boolean helper(ListNode node) {

        if (node == null)
            return true;

        boolean rres = helper(node.next);

        if (rres && node.val == left.val) {

            left = left.next;
            return true;
        }

        return false;
    }
}