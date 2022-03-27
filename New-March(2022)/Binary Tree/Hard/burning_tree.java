
// { Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class burning_tree {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            int target = Integer.parseInt(br.readLine());
            Node root = buildTree(s);

            Solution g = new Solution();
            System.out.println(g.minTime(root, target));
            t--;

        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    /*
     * class Node {
     * int data;
     * Node left;
     * Node right;
     * 
     * Node(int data) {
     * this.data = data;
     * left = null;
     * right = null;
     * }
     * }
     */

    private static ArrayList<Node> list;
    private static int maxTime;

    public static boolean find(Node root, int data) {

        if (root == null)
            return false;

        if (root.data == data) {

            list.add(root);
            return true;
        }

        boolean left = find(root.left, data);
        if (left) {

            list.add(root);
            return true;
        }

        boolean right = find(root.right, data);
        if (right) {

            list.add(root);
            return true;
        }

        return false;
    }

    public static void burnTree(Node node, Node blocker, int time) {

        if (node == null || node == blocker)
            return;

        maxTime = Math.max(maxTime, time);

        burnTree(node.left, blocker, time + 1);
        burnTree(node.right, blocker, time + 1);
    }

    public static int minTime(Node root, int target) {
        // Your code goes here
        maxTime = 0;
        list = new ArrayList<>();
        find(root, target);

        for (int i = 0; i < list.size(); i++) {

            burnTree(list.get(i), i == 0 ? null : list.get(i - 1), i);
        }

        return maxTime;
    }

}