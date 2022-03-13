import java.util.Stack;
import java.util.HashMap;

class Solution {

    public HashMap<Integer, Integer> findNextG(int[] arr) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(arr[arr.length - 1], -1);
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && arr[i] >= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                map.put(arr[i], -1);

            else
                map.put(arr[i], arr[st.peek()]);

            st.push(i);
        }

        return map;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = findNextG(nums2);
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}