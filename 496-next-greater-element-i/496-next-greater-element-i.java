class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        map.put(nums2[nums2.length - 1], -1);
        st.push(nums2.length - 1);

        for (int i = nums2.length - 2; i >= 0; i--) {

            while (st.size() != 0 && nums2[i] >= nums2[st.peek()])
                st.pop();

            if (st.size() == 0)
                map.put(nums2[i], -1);

            else
                map.put(nums2[i], nums2[st.peek()]);

            st.push(i);
        }

        int[] ans = new int[nums1.length];
        int idx = 0;

        for (int val : nums1) {

            ans[idx] = map.get(val);
            idx++;
        }

        return ans;
    }
}