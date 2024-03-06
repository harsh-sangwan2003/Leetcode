class sol_2 {

    public int majorityElement(int[] nums) {

        int count = 1, ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == ans)
                count++;

            else {

                count--;

                if (count <= 0) {

                    count = 1;
                    ans = nums[i];
                }
            }
        }

        return ans;
    }
}