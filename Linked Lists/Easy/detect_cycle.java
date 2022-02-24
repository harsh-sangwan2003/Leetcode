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
    public boolean hasCycle(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            head = head.next;
            temp = temp.next.next;

            if (head == temp)
                return true;
        }

        return false;
    }
}