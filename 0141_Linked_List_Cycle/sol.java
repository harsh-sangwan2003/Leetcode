// Definition for singly-linked list.

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {

        List<ListNode> list = new ArrayList<>();

        while (head != null) {

            if (list.contains(head))
                return true;

            list.add(head);
            head = head.next;
        }

        return false;
    }
}