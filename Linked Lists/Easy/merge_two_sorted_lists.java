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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null && list2==null)
            return null;
        
        ListNode prev = new ListNode(-1);
        ListNode temp = prev;
        
        ListNode n1 = list1;
        ListNode n2 = list2;
        
        while(n1!=null && n2!=null){
            
            if(n1.val<n2.val){
                
                ListNode node = new ListNode(n1.val);
                prev.next = node;
                prev = node;
                n1 = n1.next;
            }
            
            else{
                
                ListNode node = new ListNode(n2.val);
                prev.next = node;
                prev = node;
                n2 = n2.next;
            }
        }
        
        while(n1!=null){
            
            ListNode node = new ListNode(n1.val);
            prev.next = node;
            prev = node;
            n1 = n1.next;
        }
        
        while(n2!=null){
            
            ListNode node = new ListNode(n2.val);
            prev.next = node;
            prev = node;
            n2 = n2.next;
        }
        
        prev.next = null;
        return temp.next;
    }
}