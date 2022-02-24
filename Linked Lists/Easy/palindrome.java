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

    private ListNode left;

    public boolean isPalindrome(ListNode head) {

        left = head;
        return helper(head);
    }

    private boolean helper(ListNode node) {

        if (node == null)
            return true;

        boolean rres = helper(node.next);

        if (rres == false)
            return false;

        else if (left.val != node.val)
            return false;

        else {
            left = left.next;
            return true;
        }
    }
}