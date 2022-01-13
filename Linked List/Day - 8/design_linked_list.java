class MyLinkedList {
    
    public class Node{
        
        int data;
        Node next;
        
        public Node(int val){
            
            this.data = val;
        }
    }
    
    private Node head;
    private int size;
    
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        
        if(index<0 || index>=size)
            return -1;
        
        Node temp = head;
        
        for(int i=0; i<index; i++)
            temp = temp.next;
        
        return temp.data;
    }
    
    public void addAtHead(int val) {
        
        if(size==0){
            
            Node node = new Node(val);
            head = node;
            node.next = null;
            size++;
        }
        
        else{
            
            Node node = new Node(val);
            node.next = head;
            head = node;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        
        if(size==0){
            
            Node node = new Node(val);
            head = node;
            node.next = null;
            size++;
        }
        
        else{
            
            Node node = new Node(val);
            Node temp = head;
            
            for(int i=0; i<size-1; i++)
                temp = temp.next;
            
            temp.next = node;
            node.next = null;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index<0 || index>size)
            return;
        
        else if(index==0){
            
            addAtHead(val);
        }
        
        else if(index==size){
            
            addAtTail(val);
        }
        
        else{
            
            Node node = new Node(val);
            Node temp = head;
            
            for(int i=0; i<index-1; i++)
                temp = temp.next;
            
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        
        if(index<0 || index>=size)
            return;
        
        if(index==0){
            
            head = head.next;
            size--;
        }
        
        else{
            
            Node temp = head;
            
            for(int i=0; i<index-1; i++)
                temp = temp.next;
            
            temp.next = temp.next.next;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */