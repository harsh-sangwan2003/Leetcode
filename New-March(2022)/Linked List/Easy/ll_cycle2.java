import java.util.HashSet;
import java.util.Set;

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

        Set<ListNode> set = new HashSet<>();

        ListNode temp = head;

        while (temp != null) {

            if (set.contains(temp))
                return true;

            set.add(temp);
            temp = temp.next;
        }

        return false;
    }
}