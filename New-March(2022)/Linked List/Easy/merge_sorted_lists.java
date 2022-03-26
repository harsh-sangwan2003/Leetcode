//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode one, ListNode two) {

        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;

        while (one != null && two != null) {

            if (one.val < two.val) {

                ListNode node = new ListNode(one.val);
                temp.next = node;
                one = one.next;
            }

            else {

                ListNode node = new ListNode(two.val);
                temp.next = node;
                two = two.next;
            }

            temp = temp.next;
        }

        while (one != null) {

            ListNode node = new ListNode(one.val);
            temp.next = node;
            temp = temp.next;
            one = one.next;
        }

        while (two != null) {

            ListNode node = new ListNode(two.val);
            temp.next = node;
            temp = temp.next;
            two = two.next;
        }

        return dummy.next;
    }
}