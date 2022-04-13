class MyLinkedList {

    private class Node {

        int data;
        Node next;

        Node() {

        }

        Node(int data) {

            this.data = data;
        }

    }

    private Node head;
    private int size;

    public MyLinkedList() {

        head = new Node();
        size = 0;
    }

    public int get(int idx) {

        if (idx < 0 || idx >= size)
            return -1;

        Node temp = head;

        for (int i = 0; i < idx; i++)
            temp = temp.next;

        return temp.data;
    }

    public void addAtHead(int val) {

        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {

        if (size == 0) {

            Node node = new Node(val);
            node.next = null;
            head = node;
            size++;
        }

        else {

            Node node = new Node(val);
            Node temp = head;

            for (int i = 0; i < size - 1; i++)
                temp = temp.next;

            temp.next = node;
            node.next = null;
            size++;
        }
    }

    public void addAtIndex(int idx, int val) {

        if (idx < 0 || idx > size)
            return;

        if (idx == 0) {

            addAtHead(val);
            return;
        }

        if (idx == size) {

            addAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < idx - 1; i++)
            temp = temp.next;

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteAtIndex(int idx) {

        if (idx < 0 || idx >= size)
            return;

        if (idx == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < idx - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        size--;
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