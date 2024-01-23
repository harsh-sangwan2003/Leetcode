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

public class sol {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(-1);
        ListNode res = node;

        int carry = 0;

        while (l1 != null && l2 != null) {

            int sum = l1.val + l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(digit);
            node.next = temp;
            node = node.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {

            int sum = l1.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(digit);
            node.next = temp;
            node = node.next;

            l1 = l1.next;
        }

        while (l2 != null) {

            int sum = l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(digit);
            node.next = temp;
            node = node.next;

            l2 = l2.next;
        }

        if (carry != 0) {
            ListNode temp = new ListNode(carry);
            node.next = temp;
            node = node.next;
        }

        return res.next;
    }
}