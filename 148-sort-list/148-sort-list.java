// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return mergeLists(left, right);
    }

    public ListNode mergeLists(ListNode one, ListNode two) {

        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;

        while (one != null && two != null) {

            if (one.val < two.val) {

                ListNode curr = new ListNode(one.val);
                temp.next = curr;
                one = one.next;
            }

            else {

                ListNode curr = new ListNode(two.val);
                temp.next = curr;
                two = two.next;
            }

            temp = temp.next;
        }

        while (one != null) {

            ListNode curr = new ListNode(one.val);
            temp.next = curr;
            temp = temp.next;
            one = one.next;
        }

        while (two != null) {

            ListNode curr = new ListNode(two.val);
            temp.next = curr;
            temp = temp.next;
            two = two.next;
        }

        return dummy.next;
    }
}