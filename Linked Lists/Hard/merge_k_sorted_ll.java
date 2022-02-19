import java.util.PriorityQueue;

//   Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    
    public class Pair implements Comparable<Pair>{
    
        ListNode node;
        
        public Pair(){
            
        }
        
        public Pair(ListNode node){
            
            this.node = node;
        }
        
        public int compareTo(Pair o){
            
            return this.node.val - o.node.val;
        }
            
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0; i<lists.length; i++){
            
            if(lists[i]!=null)
            pq.add(new Pair(lists[i]));
        }
        
        while(pq.size()!=0){
            
            Pair p = pq.remove();
            
            temp.next = p.node;
            temp = temp.next;
            
            if(p.node!=null && p.node.next!=null){
                
                
                pq.add(new Pair(p.node.next));
            }
        }
        
        return dummy.next;
    }
}