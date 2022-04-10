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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;
        
        while(l1!=null && l2!=null){
            
            if(l1.val<l2.val){
                
                ListNode node = new ListNode(l1.val);
                temp.next = node;
                l1 = l1.next;
            }
            
            else{
                
                ListNode node = new ListNode(l2.val);
                temp.next = node;
                l2 = l2.next;
            }
            
            temp = temp.next;
        }
        
        while(l1!=null){
            
            ListNode node = new ListNode(l1.val);
            temp.next = node;
            temp = temp.next;
            l1 = l1.next;
            
        }
        
        while(l2!=null){
            
            ListNode node = new ListNode(l2.val);
            temp.next = node;
            temp = temp.next;
            l2 = l2.next;
        }
        
        return dummy.next;
    }
}