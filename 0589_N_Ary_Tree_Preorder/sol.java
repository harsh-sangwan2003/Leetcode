import java.util.ArrayList;
import java.util.List;

// Definition for a Node.

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public List<Integer> preorder(Node root) {
        
        if(root==null)
        return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        res.add(root.val);

        for(Node child : root.children){

            List<Integer> list = preorder(child);

            for(int val : list)
            res.add(val);
        }

        return res;
    }
}