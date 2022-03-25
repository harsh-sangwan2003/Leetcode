
//   Definition for singly-linked list.
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

        ListNode temp = head;

        while (temp != null) {

            if (temp.val == val)
                temp = temp.next;

            else
                break;
        }

        if (temp == null)
            return null;

        ListNode dummy = temp;

        while (temp.next != null) {

            if (temp.next.val == val)
                temp.next = temp.next.next;

            else
                temp = temp.next;
        }

        return dummy;
    }
}