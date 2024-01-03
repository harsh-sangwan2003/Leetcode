//  Definition for singly-linked list.
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node = new ListNode(-1);
        ListNode dummy = node;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {

                ListNode temp = new ListNode(list1.val);
                node.next = temp;
                node = node.next;
                list1 = list1.next;
            }

            else {

                ListNode temp = new ListNode(list2.val);
                node.next = temp;
                node = node.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {

            ListNode temp = new ListNode(list1.val);
            node.next = temp;
            node = node.next;
            list1 = list1.next;
        }

        while (list2 != null) {

            ListNode temp = new ListNode(list2.val);
            node.next = temp;
            node = node.next;
            list2 = list2.next;
        }

        return dummy.next;
    }
}