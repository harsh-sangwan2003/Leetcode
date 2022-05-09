/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    static ListNode dummy;
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        dummy = null;
        
        helper(head);
        head.next = null;
        
        return dummy;
    }
    
    public void helper(ListNode head){
        
        if(head==null)
            return;
        
        helper(head.next);
        
        if(head.next==null)
        {
            dummy = head;
            return;
        }
        
        head.next.next = head;
    }
}